package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.UtilisateurManager;
import org.example.demo.ticket.consumer.impl.dao.AbstractDaoImpl;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;


import javax.inject.Named;
import java.util.List;

@Named
public class UtilisateurManagerImpl extends AbstractManagerImpl implements UtilisateurManager {
    @Override
    public Utilisateur getUtilisateur(Integer pId) throws NotFoundException {
        return getDaoFactory().getUtilisateurDao().getUtilisateur(pId);
    }

    @Override
    public List<Utilisateur> getListUtilisateur() {
        return getDaoFactory().getUtilisateurDao().getListUtilisateur();
    }

    @Override
    public int getCountUtilisateur() {
        return getDaoFactory().getUtilisateurDao().getCountUtilisateur();
    }
}
