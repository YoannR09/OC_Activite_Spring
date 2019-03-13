package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;
import org.example.demo.ticket.consumer.rowmapper.UtilisateurRM;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {

    @Inject
    UtilisateurRM utilisateurRM;

    public Utilisateur getUtilisateur(Integer pId) {

        String vSQL = "SELECT * FROM utilisateur WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());


        Utilisateur utilisateur = vJdbcTemplate.queryForObject(vSQL, utilisateurRM);

        return utilisateur;
    }


    public List<Utilisateur> getListUtilisateur() {
        String vSQL = "SELECT * FROM utilisateur";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        return vJdbcTemplate.query(vSQL, utilisateurRM);
    }

    public int getCountUtilisateur() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrUtilisateur = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM utilisateur",
                Integer.class);
        return vNbrUtilisateur;
    }


}
