package org.example.demo.ticket.consumer.contract.dao;

import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;

import java.util.List;

public interface VersionDao {
    Version getVersion(Integer pId) throws NotFoundException;
    List<Version> getListVersion();
    int getCountVersion();
}
