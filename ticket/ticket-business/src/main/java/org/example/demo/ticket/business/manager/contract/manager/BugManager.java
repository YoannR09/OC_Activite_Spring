package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface BugManager {
    Bug getBug(Integer pId) throws NotFoundException;

    List<Bug> getListBug();

    int getCountBug();
}
