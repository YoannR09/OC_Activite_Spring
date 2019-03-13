package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class StatutRM implements RowMapper<TicketStatut> {

    @Override
    public TicketStatut mapRow(ResultSet rs, int i) throws SQLException {
        TicketStatut statut = new TicketStatut();
        statut.setId(rs.getInt("id"));
        statut.setLibelle(rs.getString("libelle"));
        return statut;
    }
}
