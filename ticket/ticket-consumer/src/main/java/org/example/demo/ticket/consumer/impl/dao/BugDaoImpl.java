package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.BugDao;
import org.example.demo.ticket.consumer.rowmapper.BugRM;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class BugDaoImpl extends AbstractDaoImpl implements BugDao {

    @Inject
    BugRM rowMapper;

    @Override
    public Bug getBug(Integer pId) {
        String vSQL = "SELECT * FROM bug WHERE ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        Bug bug = (Bug) vJdbcTemplate.query(vSQL, rowMapper);

        return bug;
    }

    @Override
    public List<Bug> getListBug() {

        String vSQL = "SELECT * FROM bug";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());

        List<Bug> listBug = vJdbcTemplate.query(vSQL, rowMapper);

        return listBug;
    }

    @Override
    public int getCountBug() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrBugNiveau = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM bug",
                Integer.class);
        return vNbrBugNiveau;
    }


}
