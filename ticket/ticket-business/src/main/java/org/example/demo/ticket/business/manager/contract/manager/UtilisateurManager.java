package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface UtilisateurManager {
    Utilisateur getUtilisateur(Integer pId) throws NotFoundException;
    List<Utilisateur> getListUtilisateur();
    int getCountUtilisateur();
}
