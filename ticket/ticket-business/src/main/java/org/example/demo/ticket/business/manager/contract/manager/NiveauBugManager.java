package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface NiveauBugManager {
    BugNiveau getBugNiveau(Integer pId) throws NotFoundException;
    List<BugNiveau> getListBugNiveau();
}
