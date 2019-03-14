package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.EvolutionDao;
import org.example.demo.ticket.consumer.rowmapper.EvolutionRM;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class EvolutionDaoImpl extends AbstractDaoImpl implements EvolutionDao {

    @Inject
    EvolutionRM rowMapper;

    @Override
    public Evolution getEvolution(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM evolution WHERE id ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        Evolution evolution = (Evolution) vJdbcTemplate.query(vSQL, rowMapper);

        return evolution;
    }

    @Override
    public List<Evolution> getListEvolution() {
        String vSQL = "SELECT * FROM evolution";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

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
}
