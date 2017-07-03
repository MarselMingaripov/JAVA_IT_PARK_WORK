package ru.itpark.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import ru.itpark.models.Food;
import ru.itpark.models.Order;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class OrderDaoImpl implements OrderDao {

    //language=SQL
    private final String SQL_INSERT_ORDER =
            "INSERT INTO ordre(cathegory, name, cost) VALUES(:cathegory, :name, :cost)";

    //language=SQL
    private final String SQL_SELECT_ORDER_BY_ID =
            "SELECT * FROM order WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ALL =
            "SELECT * FROM order";

    //language=SQL
    private final String SQL_DELETE_ORDER_BY_ID =
            "DELETE FROM order WHERE id = :id";

    //language=SQL
    private final String SQL_ORDER_UPDATE_BY_ID =
            "UPDATE order SET cathogory = :cathogory, name = :name, cost = :cost WHERE id = :id";

    //language=SQL
    private final String SQL_SELECT_ORDER_BY_COST =
            "SELECT * FROM order WHERE cost = :cost";

    private NamedParameterJdbcTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public OrderDaoImpl(DataSource dataSource) {
        this.template = new NamedParameterJdbcTemplate(dataSource);
    }


    @Override
    public int save(Order name) {
        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("cathegory", name.getCathegory());
        params.addValue("name", name.getName());
        params.addValue("cost", name.getCost());

        String interestingKeys[] = {"id"};

        KeyHolder holder = new GeneratedKeyHolder();
        template.update(SQL_INSERT_ORDER, params, holder, interestingKeys);
        Number generatedId = holder.getKey();
        return generatedId.intValue();
    }

    private RowMapper<Order> orderRowMapper = new RowMapper<Order>() {
        public Order mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String cathegory = resultSet.getString("cathegory");
            String name = resultSet.getString("name");
            int cost = resultSet.getInt("cost");
            return new Order(id, cathegory, name, cost);
        }
    };

    @Override
    public Order find(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        return template.queryForObject(SQL_SELECT_ORDER_BY_ID, params, orderRowMapper);
    }

    @Override
    public void update(Order name) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", name.getId());
        params.put("cathegory", name.getCathegory());
        params.put("name", name.getName());
        params.put("cost", name.getCost());
        template.update(SQL_ORDER_UPDATE_BY_ID, params);

    }

    @Override
    public void delete(int id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", id);
        template.update(SQL_DELETE_ORDER_BY_ID, params);

    }

    @Override
    public List<Order> findAll() {
        return template.query(SQL_SELECT_ALL, orderRowMapper);
    }
}
