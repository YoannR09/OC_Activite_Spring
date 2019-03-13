package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.NiveauBugDao;
import org.example.demo.ticket.consumer.rowmapper.NiveauBugRM;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class NiveauBugDaoImpl extends AbstractDaoImpl implements NiveauBugDao {

    @Inject
    NiveauBugRM rowMapper;

    @Override
    public BugNiveau getBugNiveau(Integer pId) throws NotFoundException {
        String vSQL = "SELECT * FROM niveau_bug WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        BugNiveau bugNiveau = (BugNiveau)vJdbcTemplate.query(vSQL, rowMapper);

        return bugNiveau;
    }

    public List<BugNiveau> getListBugNiveau() {
        String vSQL = "SELECT * FROM niveau_bug";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        List<BugNiveau> vListBugNiveau = vJdbcTemplate.query(vSQL, rowMapper);

        return vListBugNiveau;
    }

    @Override
    public int getCountBugNiveau() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrBugNiveau = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM niveau_bug",
                Integer.class);
        return vNbrBugNiveau;
    }
}
