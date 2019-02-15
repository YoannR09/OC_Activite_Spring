package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.EvolutionDao;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class EvolutionDaoImpl extends AbstractDaoImpl implements EvolutionDao {

    @Override
    public Evolution getEvolution(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM evolution WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Evolution> rowMapper = mapper();

        Evolution evolution = (Evolution) vJdbcTemplate.query(vSQL, rowMapper);

        return evolution;
    }

    @Override
    public List<Evolution> getListEvolution() {
        String vSQL = "SELECT * FROM evolution";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Evolution> rowMapper = mapper();

        List<Evolution> vListEvolution = vJdbcTemplate.query(vSQL, rowMapper);

        return vListEvolution;
    }

    @Override
    public int getCountEvolution() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrEvolution = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM evolution",
                Integer.class);
        return vNbrEvolution;
    }

    public RowMapper<Evolution> mapper(){
        RowMapper<Evolution> rowMapper = (rs, i) -> {
            Evolution evolution = new Evolution();
            evolution.setPriorite(rs.getInt("priorite"));
            return evolution;
        };
        return rowMapper;
    }
}
