package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.TicketDao;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class TicketDaoImpl extends AbstractDaoImpl implements TicketDao {

    public Ticket getTicket(long pId) throws NotFoundException {

        String vSQL = "SELECT * FROM ticket WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Ticket> rowMapper = mapper();

        Ticket ticket = (Ticket) vJdbcTemplate.query(vSQL, rowMapper);

        return ticket;
    }



    public List<Ticket> getListTicket() {

        String vSQL = "SELECT * FROM ticket";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Ticket> rowMapper = mapper();

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

    public RowMapper<Ticket> mapper(){
        RowMapper<Ticket> rowMapper = (rs, i) -> {
            ProjetDaoImpl projet = new ProjetDaoImpl();
            Ticket ticket = new Ticket();
            ticket.setNumero(rs.getLong("numero"));
            ticket.setTitre(rs.getString("titre"));
            ticket.setDate(rs.getDate("date"));
            ticket.setDescription(rs.getString("description"));
            try {
                ticket.setProjet(projet.getProjet(rs.getInt("projet_id")));
            } catch (NotFoundException e) {
                e.printStackTrace();
            }

            return ticket;
        };
        return rowMapper;
    }

}
