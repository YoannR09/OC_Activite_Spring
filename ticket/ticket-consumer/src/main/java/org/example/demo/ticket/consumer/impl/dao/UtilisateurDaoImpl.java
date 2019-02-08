package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.UtilisateurDao;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurDaoImpl extends AbstractDaoImpl implements UtilisateurDao {
    public Utilisateur getUtilisateur(Integer pId) {

        return null;
    }


    public List<Utilisateur> getListUtilisateur() {
        String vSQL = "SELECT * FROM utilisateur";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Utilisateur> rowMapper = (rs, i) -> {
            Utilisateur vUtilisateur = new Utilisateur();
            vUtilisateur.setId(rs.getInt("id"));
            vUtilisateur.setNom(rs.getString("nom"));
            vUtilisateur.setPrenom(rs.getString("prenom"));

            return vUtilisateur;
        };

        return vJdbcTemplate.query(vSQL, rowMapper);
    }

    public int getCountUtilisateur() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrUtilisateur = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM utilisateur",
                Integer.class);
        return vNbrUtilisateur;
    }
}
