package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface TicketDao {
    Ticket getTicket(long pNum) throws NotFoundException;
    List<Ticket> getListTicket();
    int getCountTicket();
}
