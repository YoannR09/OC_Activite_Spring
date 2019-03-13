package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.StatutDao;
import org.example.demo.ticket.consumer.rowmapper.StatutRM;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class StatutDaoImpl extends AbstractDaoImpl implements StatutDao {

    @Inject
    StatutRM rowMapper;

    @Override
    public TicketStatut getStatut(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM statut WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        TicketStatut statut = vJdbcTemplate.queryForObject(vSQL, rowMapper);

        return statut;
    }

    @Override
    public List<TicketStatut> getListStatut() {
        String vSQL = "SELECT * FROM statut";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        List<TicketStatut> vListStatut = vJdbcTemplate.query(vSQL, rowMapper);

        return vListStatut;
    }

    @Override
    public int getCountStatut() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrStatut = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM statut",
                Integer.class);
        return vNbrStatut;
    }
}
