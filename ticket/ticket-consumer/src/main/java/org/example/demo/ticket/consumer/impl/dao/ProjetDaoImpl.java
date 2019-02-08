package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.model.bean.projet.Projet;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Named
public class ProjetDaoImpl extends AbstractDaoImpl implements ProjetDao {


    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {


        return null;
    }

    public List<Projet> getListProjet() {
        String vSQL = "SELECT * FROM projet";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        RowMapper<Projet> rowMapper = new RowMapper<Projet>() {
            @Override
            public Projet mapRow(ResultSet rs, int i) throws SQLException {
                Projet vProjet = new Projet(rs.getInt("id"));
                vProjet.setNom(rs.getString("nom"));
                vProjet.setCloture(rs.getBoolean("cloture"));
                vProjet.setDateCreation(rs.getDate("date_creation"));

                return vProjet;
            }
        };

        List<Projet> vListProjet = vJdbcTemplate.query(vSQL, rowMapper);

        return vListProjet;
    }

    @Override
    public int getCountProjet() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrTicket = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM projet",
                Integer.class);
        return vNbrTicket;

    }
}
