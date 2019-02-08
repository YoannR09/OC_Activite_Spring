package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;

import javax.inject.Named;
import java.util.List;

@Named
public class TicketManagerImpl extends AbstractManagerImpl implements TicketManager {
    @Override
    public Ticket getTicket(long pId) {
        return null;
    }

    @Override
    public List<Ticket> getListTicket() {
        return null;
    }
}
