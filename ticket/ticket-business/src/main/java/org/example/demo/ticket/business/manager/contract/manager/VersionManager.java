package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface VersionManager {
    Version getVersion(Integer pId) throws NotFoundException;
    List<Version> getListVersion();
    int getCountVersion();
}
