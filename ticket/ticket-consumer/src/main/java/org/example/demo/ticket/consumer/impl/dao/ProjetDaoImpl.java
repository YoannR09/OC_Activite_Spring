package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class ProjetDaoImpl extends AbstractDaoImpl implements ProjetDao {


    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {

        String vSQL = "SELECT * FROM projet WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Projet> rowMapper = mapper();

        Projet projet = (Projet) vJdbcTemplate.query(vSQL, rowMapper);

        return projet;
    }

    public List<Projet> getListProjet() {
        String vSQL = "SELECT * FROM projet";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Projet> rowMapper = mapper();

        List<Projet> vListProjet = vJdbcTemplate.query(vSQL, rowMapper);

        return vListProjet;
    }

    @Override
    public int getCountProjet() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrProjet = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM projet",
                Integer.class);
        return vNbrProjet;

    }
    
    public RowMapper<Projet> mapper(){
        RowMapper<Projet> rowMapper = (rs, i) -> {
            Projet projet = new Projet();
            UtilisateurDaoImpl utilisateur = new UtilisateurDaoImpl();
            projet.setId(rs.getInt("id"));
            projet.setNom(rs.getString("nom"));
            projet.setCloture(rs.getBoolean("cloture"));
            projet.setDateCreation(rs.getDate("date_creation"));
            projet.setResponsable(utilisateur.getUtilisateur(rs.getInt("id")));
            return projet;
        };
        return rowMapper;
    }
}
