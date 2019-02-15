package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface BugDao {
    Bug getBug(Integer pId) throws NotFoundException;

    List<Bug> getListBug();

    int getCountBug();
}
