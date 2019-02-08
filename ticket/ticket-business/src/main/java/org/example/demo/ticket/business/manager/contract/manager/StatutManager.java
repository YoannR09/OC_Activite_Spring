package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface StatutManager {
    TicketStatut getTicketStatut(Integer pId) throws NotFoundException;
    List<TicketStatut> getListTicketStatut();
}
