package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface TicketManager {
    Ticket getTicket(long pId) throws NotFoundException;
    List<Ticket> getListTicket();
    int getCountTicket();

}
