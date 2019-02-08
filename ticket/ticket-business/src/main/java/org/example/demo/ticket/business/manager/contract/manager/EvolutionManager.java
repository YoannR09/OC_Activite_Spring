package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface EvolutionManager {
    Evolution getEvolution(Integer pId) throws NotFoundException;
    List<Evolution> getListEvolution();
}
