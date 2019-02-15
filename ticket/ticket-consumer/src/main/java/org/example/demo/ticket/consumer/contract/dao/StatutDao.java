package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface StatutDao {
    TicketStatut getStatut(Integer pId) throws NotFoundException;

    List<TicketStatut> getListStatut();

    int getCountStatut();
}
