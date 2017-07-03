package ru.itpark.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import ru.itpark.models.Food;

import javax.sql.DataSource;
import java.io.BufferedOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FoodDaoImpl implements FoodDao {

    //language=SQL
    private final String SQL_INSERT_FOOD =
            "INSERT INTO food(cathegory, name, cost) VALUES(:cathegory, :name, :cost)";

    //language=SQL
    private final String SQL_SELECT_FOOD_BY_ID =
            "SELECT * FROM food WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM food";

    //language=SQL
    private final String SQL_DELETE_FOOD_BY_ID =
            "DELETE FROM food WHERE id = :id";

    //language=SQL
    private final String SQL_FOOD_UPDATE_BY_ID =
            "UPDATE food SET cathogory = :cathogory, name = :name, cost = :cost WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_FOOD_BY_COST =
            "SELECT * FROM food WHERE cost = :cost";

    private NamedParameterJdbcTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public FoodDaoImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }

       @Override
    public List<Food> FindAllByCost(int cost) {
        Session session = getSession();
        session.beginTransaction();

        List<Food> foods = session.createQuery("from Food food where food.cost = :cost", Food.class)
                .setParameter("cost", cost).list();
        session.getTransaction().commit();
        return foods;
    }

    @Override
    public int save(Food name) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("cathegory", name.getCathegory());
        params.addValue("name", name.getName());
        params.addValue("cost", name.getCost());

        String interestingKeys[] = {"id"};

        KeyHolder holder = new GeneratedKeyHolder();
        template.update(SQL_INSERT_FOOD, params, holder, interestingKeys);
        Number generatedId = holder.getKey();
        return generatedId.intValue();
    }

    private RowMapper<Food> foodRowMapper = new RowMapper<Food>() {
        public Food mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String cathegory = resultSet.getString("cathegory");
            String name = resultSet.getString("name");
            int cost = resultSet.getInt("cost");
            return new Food(id, cathegory, name, cost);
        }
    };

    @Override
    public Food find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_FOOD_BY_ID, params, foodRowMapper);
    }

    @Override
    public void update(Food name) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", name.getId());
        params.put("cathegory", name.getCathegory());
        params.put("name", name.getName());
        params.put("cost", name.getCost());
        template.update(SQL_FOOD_UPDATE_BY_ID, params);

    }

    @Override
    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_FOOD_BY_ID, params);

    }

    @Override
    public List<Food> findAll() {
        return template.query(SQL_SELECT_ALL, foodRowMapper);
    }

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (HibernateException e) {
            session = sessionFactory.openSession();
        }

        return session;
    }
    BufferedOutputStream e;
}
