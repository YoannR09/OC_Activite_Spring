package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.CommentaireManager;
import org.example.demo.ticket.model.bean.ticket.Commentaire;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class CommentaireManagerImpl extends AbstractManagerImpl implements CommentaireManager {
    @Override
    public Commentaire getCommentaire(Integer pId) throws NotFoundException {
        return getDaoFactory().getCommentaireDao().getCommentaire(pId);
    }

    @Override
    public List<Commentaire> getListCommentaire() {
        return getDaoFactory().getCommentaireDao().getListCommentaire();
    }

    @Override
    public int getCountCommentaire() {
        return getDaoFactory().getCommentaireDao().getCountCommentaire();
    }


}
