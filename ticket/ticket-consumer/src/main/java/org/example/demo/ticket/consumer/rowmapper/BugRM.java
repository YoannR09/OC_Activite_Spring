package org.example.demo.ticket.consumer.rowmapper;

import org.example.demo.ticket.consumer.contract.dao.NiveauBugDao;
import org.example.demo.ticket.consumer.impl.dao.NiveauBugDaoImpl;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.sql.ResultSet;
import java.sql.SQLException;

@Named
public class BugRM implements RowMapper<Bug> {

    NiveauBugDao niveauBugDao;

    @Override
    public Bug mapRow(ResultSet rs, int i) throws SQLException {
        Bug bug = new Bug();
        try {
            bug.setNiveau(niveauBugDao.getBugNiveau(rs.getInt("niveau_bug_id")));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        return bug;
    }
}
