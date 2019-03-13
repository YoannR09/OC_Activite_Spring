package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.contract.dao.StatutDao;
import org.example.demo.ticket.consumer.impl.dao.ProjetDaoImpl;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class TicketRM implements RowMapper<Ticket> {

    ProjetDao projetDao;
    StatutDao statutDao;

    @Override
    public Ticket mapRow(ResultSet rs, int i) throws SQLException {
        Ticket ticket = new Ticket();
        ticket.setNumero(rs.getLong("numero"));
        ticket.setTitre(rs.getString("titre"));
        ticket.setDate(rs.getDate("date"));
        ticket.setDescription(rs.getString("description"));
        try {
            ticket.setStatut(statutDao.getStatut(rs.getInt("statut_id")));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        try {
            ticket.setProjet(projetDao.getProjet(rs.getInt("projet_id")));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return ticket;
    }
}
