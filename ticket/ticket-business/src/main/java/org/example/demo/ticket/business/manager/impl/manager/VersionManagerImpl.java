package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.VersionManager;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;

import javax.inject.Named;
import java.util.List;

@Named
public class VersionManagerImpl extends AbstractManagerImpl implements VersionManager {
    @Override
    public Version getVersion(Integer pId) throws NotFoundException {
        return getDaoFactory().getVersionDao().getVersion(pId);
    }

    @Override
    public List<Version> getListVersion() {
        return getDaoFactory().getVersionDao().getListVersion();
    }

    @Override
    public int getCountVersion() {
        return getDaoFactory().getVersionDao().getCountVersion();
    }
}
