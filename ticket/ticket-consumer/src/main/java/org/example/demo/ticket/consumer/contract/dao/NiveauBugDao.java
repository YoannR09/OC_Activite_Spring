package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface NiveauBugDao {
    BugNiveau getBugNiveau(Integer pId) throws NotFoundException;

    List<BugNiveau> getListBugNiveau();

    int getCountBugNiveau();
}
