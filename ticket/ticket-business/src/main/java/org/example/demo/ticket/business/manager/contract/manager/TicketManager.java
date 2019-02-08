package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Ticket;

import java.util.List;

public interface TicketManager {
    Ticket getTicket(long pId);
    List<Ticket> getListTicket();

}
