package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.rowmapper.ProjetRM;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.example.demo.ticket.consumer.contract.dao.ProjetDao;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class ProjetDaoImpl extends AbstractDaoImpl implements ProjetDao {

    @Inject
    ProjetRM projetRM;



    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {

        String vSQL = "SELECT * FROM public.projet WHERE id ="+pId;
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        Projet projet = (Projet) vJdbcTemplate.query(vSQL, projetRM);

        return projet;
    }

    public List<Projet> getListProjet() {
        String vSQL = "SELECT * FROM public.projet";
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        List<Projet> vListProjet = vJdbcTemplate.query(vSQL, projetRM);


        return vListProjet;
    }

    @Override
    public int getCountProjet() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrProjet = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM public.projet",
                Integer.class);
        return vNbrProjet;

    }
}
