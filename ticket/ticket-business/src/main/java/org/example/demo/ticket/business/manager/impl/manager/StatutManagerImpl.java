package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.StatutManager;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class StatutManagerImpl extends AbstractManagerImpl implements StatutManager {
    @Override
    public TicketStatut getTicketStatut(Integer pId) throws NotFoundException {
        return null;
    }

    @Override
    public List<TicketStatut> getListTicketStatut() {
        return null;
    }
}
