package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.BugManager;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;

import java.util.List;

@Named
public class BugManagerImpl extends AbstractManagerImpl implements BugManager {
    @Override
    public Bug getBug(Integer pId) throws NotFoundException {
        return null;
    }

    @Override
    public List<Bug> getListBug() {
        return null;
    }
}
