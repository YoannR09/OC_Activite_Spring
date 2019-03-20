package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;
import org.example.demo.ticket.consumer.impl.dao.AbstractDaoImpl;
import org.example.demo.ticket.consumer.impl.dao.UtilisateurDaoImpl;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class ProjetRM implements RowMapper<Projet> {

    UtilisateurDao utilisateurDao;

    @Override
    public Projet mapRow(ResultSet rs, int i) throws SQLException {
        Projet projet = new Projet(rs.getInt("id"));

        projet.setNom(rs.getString("nom"));
        projet.setCloture(rs.getBoolean("cloture"));
        projet.setDateCreation(rs.getDate("date_creation"));
        try {
            Utilisateur responsable = utilisateurDao.getUtilisateur(rs.getInt("responsable_id"));
            projet.setResponsable(responsable);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return projet;
    }
}
