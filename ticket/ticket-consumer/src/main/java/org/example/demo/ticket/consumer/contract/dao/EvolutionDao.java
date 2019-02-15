package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface EvolutionDao {
    Evolution getEvolution(Integer pId)  throws NotFoundException;

    List<Evolution> getListEvolution();

    int getCountEvolution();
}
