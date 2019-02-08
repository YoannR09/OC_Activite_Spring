package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.ProjetManager;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
public class ProjetManagerImpl extends AbstractManagerImpl implements ProjetManager {
    @Override
    public Projet getProjet(Integer pId) throws NotFoundException {
        return getDaoFactory().getProjetDao().getProjet(pId);
    }


    @Override
    public List<Projet> getListProjet() {
        List<Projet> vList = getDaoFactory().getProjetDao().getListProjet();
        return vList;
    }

    @Override
    public int getCountProjet(){

        return getDaoFactory().getProjetDao().getCountProjet();
    }
}
