package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProjetRM implements RowMapper<Projet> {
    @Override
    public Projet mapRow(ResultSet rs, int i) throws SQLException {
        Projet projet = new Projet();
        projet.setId(rs.getInt("id"));
        projet.setNom(rs.getString("nom"));
        projet.setCloture(rs.getBoolean("cloture"));
        projet.setDateCreation(rs.getDate("date_creation"));
        return projet;
    }
}
