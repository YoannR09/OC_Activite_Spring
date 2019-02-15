package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class TicketManagerImpl extends AbstractManagerImpl implements TicketManager {
    @Override
    public Ticket getTicket(long pNum) throws NotFoundException {
        return getDaoFactory().getTicketDao().getTicket(pNum);
    }

    @Override
    public List<Ticket> getListTicket() {
        return getDaoFactory().getTicketDao().getListTicket();
    }

    public int getCountTicket() {
        return getDaoFactory().getTicketDao().getCountTicket();
    }
}
