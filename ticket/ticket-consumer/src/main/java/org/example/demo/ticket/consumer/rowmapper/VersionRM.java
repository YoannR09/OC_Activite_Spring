package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.consumer.impl.dao.ProjetDaoImpl;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class VersionRM implements RowMapper<Version> {

    ProjetDao projetDao;

    @Override
    public Version mapRow(ResultSet rs, int i) throws SQLException {
        Version version = new Version();
        version.setNumero(String.valueOf(rs.getLong("numero")));
        try {
            version.setProjet(projetDao.getProjet(rs.getInt("projet_id")));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
}
