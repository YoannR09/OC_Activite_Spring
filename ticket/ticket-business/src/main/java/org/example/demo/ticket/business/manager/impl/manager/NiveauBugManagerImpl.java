package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.NiveauBugManager;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class NiveauBugManagerImpl extends AbstractManagerImpl implements NiveauBugManager {
    @Override
    public BugNiveau getBugNiveau(Integer pId) throws NotFoundException {
        return getDaoFactory().getNiveauBugDao().getBugNiveau(pId);
    }

    @Override
    public List<BugNiveau> getListBugNiveau() {
        return getDaoFactory().getNiveauBugDao().getListBugNiveau();
    }

    public int getCountBugNiveau(){
     return getDaoFactory().getNiveauBugDao().getCountBugNiveau();
    }
}
