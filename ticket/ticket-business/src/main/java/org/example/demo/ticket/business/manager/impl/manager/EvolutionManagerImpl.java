package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.EvolutionManager;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class EvolutionManagerImpl extends AbstractManagerImpl implements EvolutionManager {
    @Override
    public Evolution getEvolution(Integer pId) throws NotFoundException {
        return getDaoFactory().getEvolutionDao().getEvolution(pId);
    }

    @Override
    public List<Evolution> getListEvolution() {
        return getDaoFactory().getEvolutionDao().getListEvolution();
    }

    @Override
    public int getCountEvolution() {
        return getDaoFactory().getEvolutionDao().getCountEvolution();
    }
}
