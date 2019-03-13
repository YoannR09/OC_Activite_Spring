package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class NiveauBugRM implements RowMapper<BugNiveau> {
    @Override
    public BugNiveau mapRow(ResultSet rs, int i) throws SQLException {
            BugNiveau bugNiveau = new BugNiveau();
            bugNiveau.setId(rs.getInt("id"));
            bugNiveau.setOrdre(rs.getInt("ordre"));
            bugNiveau.setLibelle(rs.getString("libelle"));
            return bugNiveau;
    }
}
