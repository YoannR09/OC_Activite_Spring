package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface CommentaireDao {
    Commentaire getCommentaire(Integer pId) throws NotFoundException;

    List<Commentaire> getListCommentaire();

    int getCountCommentaire();
}
