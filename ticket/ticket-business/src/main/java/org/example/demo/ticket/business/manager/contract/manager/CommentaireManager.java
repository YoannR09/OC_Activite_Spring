package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface CommentaireManager {

    Commentaire getCommentaire(Integer pId) throws NotFoundException;
    List<Commentaire> getListCommentaire();
    int getCountCommentaire();
}
