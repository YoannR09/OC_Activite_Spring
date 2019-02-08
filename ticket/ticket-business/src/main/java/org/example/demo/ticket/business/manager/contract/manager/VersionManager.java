package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.model.bean.projet.Version;

import java.util.List;

public interface VersionManager {
    Version getVersion(Integer pId);
    List<Version> getListVersion();
}
