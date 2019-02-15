package org.example.demo.ticket.consumer.impl.dao;

import org.example.demo.ticket.consumer.contract.dao.CommentaireDao;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.inject.Named;
import java.util.List;

@Named
public class CommentaireDaoImpl extends AbstractDaoImpl implements CommentaireDao {

    @Override
    public Commentaire getCommentaire(Integer pId) throws NotFoundException {
        return null;
    }

    @Override
    public List<Commentaire> getListCommentaire() {
        return null;
    }

    @Override
    public int getCountCommentaire() {
        JdbcTemplate vJdbcTemplate = new JdbcTemplate(getDataSource());
        int vNbrCommentaire = vJdbcTemplate.queryForObject(
                "SELECT COUNT(*) FROM commentaire",
                Integer.class);
        return vNbrCommentaire;
    }

    public RowMapper<Commentaire> mapper(){
        RowMapper<Commentaire> rowMapper = (rs, i) -> {
            Commentaire commentaire = new Commentaire();
            // Le bean Commentaire est vide.
            return commentaire;
        };
        return rowMapper;
    }
}
