package ru.itpark.dao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import ru.itpark.models.Car;

import javax.sql.DataSource;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarDaoJdbcImpl implements CarsDao {

        private NamedParameterJdbcTemplate template;

        //language=SQL
        private final String SQL_INSERT_CAR =
                "INSERT INTO auto(name, cost) VALUES(:name, :cost)";

        //language=SQL
        private final String SQL_SELECT_CAR_BY_ID =
                "SELECT * FROM auto WHERE id = :id";

        //language=SQL
        private final String SQL_SELECT_ALL =
                "SELECT * FROM auto";

        //language=SQL
        private final String SQL_DELETE_CAR_BY_ID =
                "DELETE FROM auto WHERE id = :id";

        //language=SQL
        private final String SQL_CAR_UPDATE_BY_ID =
                "UPDATE auto SET name = :name, cost = :cost WHERE id = :id";
        //language=SQL
        private final String SQL_SELECT_CAR_BY_NAME = "SELECT * FROM auto WHERE name = :name";

        public CarDaoJdbcImpl(DataSource dataSource) {

            this.template = new NamedParameterJdbcTemplate(dataSource);
        }

        public int save(Car model) {
            // собрали значения именнованных параметров
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("name", model.getName());
            params.addValue("cost", model.getCost());

            String interestingKeys[] = {"id"};

            // держатель сгенерированного ключа вставленной строки
            KeyHolder holder = new GeneratedKeyHolder();
            template.update(SQL_INSERT_CAR, params, holder, interestingKeys);
            Number generatedId = holder.getKey();
            return generatedId.intValue();
        }

        // анонимный класс
        // реализуем интерфейс "на месте"
        private RowMapper<Car> carRowMapper = new RowMapper<Car>() {
            public Car mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int cost = resultSet.getInt("cost");

                return new Car(id, name, cost);
            }
        };


    public int save(Object model) {
        return 0;
    }

    public Car find(int id) {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id", id);
            return template.queryForObject(SQL_SELECT_CAR_BY_ID, params, carRowMapper);
        }

    public void update(Object model) {

    }


    public void update(Car model) {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id", model.getId());
            params.put("name", model.getName());
            params.put("cost", model.getCost());
            template.update(SQL_CAR_UPDATE_BY_ID, params);
        }

        public void delete(int id) {
            Map<String, Object> params = new HashMap<String, Object>();
            params.put("id", id);
            template.update(SQL_DELETE_CAR_BY_ID, params);
        }

        public List<Car> findAll() {
            return template.query(SQL_SELECT_ALL, carRowMapper);
        }

}
