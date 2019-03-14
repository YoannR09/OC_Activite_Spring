package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.consumer.rowmapper.ProjetRM;
import org.example.demo.ticket.consumer.rowmapper.TicketRM;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    @Inject
    TicketRM rowMapper;

    public Ticket getTicket(long pId) throws NotFoundException {

        String vSQL = "SELECT * FROM ticket WHERE id ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        Ticket ticket = vJdbcTemplate.queryForObject(vSQL, rowMapper);

        return ticket;
    }



    public List<Ticket> getListTicket() {

        String vSQL = "SELECT * FROM ticket";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        List<Ticket> vListTicket = vJdbcTemplate.query(vSQL, rowMapper);

        return vListTicket;
    }

    @Override
    public int getCountTicket() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM ticket",
                Integer.class);
        return vNbrTicket;
    }

}
