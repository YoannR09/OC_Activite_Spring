package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface UtilisateurDao {
    Utilisateur getUtilisateur(Integer pId) throws NotFoundException;

    List<Utilisateur> getListUtilisateur();

    int getCountUtilisateur();
}
