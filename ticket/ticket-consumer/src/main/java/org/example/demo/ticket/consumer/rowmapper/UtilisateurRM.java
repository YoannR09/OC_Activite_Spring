package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class UtilisateurRM implements RowMapper<Utilisateur> {

    @Override
    public Utilisateur mapRow(ResultSet rs, int i) throws SQLException {
        Utilisateur vUtilisateur = new Utilisateur();
        vUtilisateur.setId(rs.getInt("id"));
        vUtilisateur.setNom(rs.getString("nom"));
        vUtilisateur.setPrenom(rs.getString("prenom"));

        return vUtilisateur;
    }
}
