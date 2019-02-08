package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.VersionManager;
import org.example.demo.ticket.model.bean.projet.Version;

import javax.inject.Named;
import java.util.List;

@Named
public class VersionManagerImpl extends AbstractManagerImpl implements VersionManager {
    @Override
    public Version getVersion(Integer pId) {
        return null;
    }

    @Override
    public List<Version> getListVersion() {
        return null;
    }
}
