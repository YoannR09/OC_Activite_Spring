package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface ProjetDao {
    Projet getProjet(Integer pId) throws NotFoundException;

    List<Projet> getListProjet();

    int getCountProjet();
}
