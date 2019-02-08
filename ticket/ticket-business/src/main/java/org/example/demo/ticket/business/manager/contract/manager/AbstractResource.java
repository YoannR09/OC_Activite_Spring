package org.example.demo.ticket.business.manager.contract.manager;

import org.example.demo.ticket.consumer.contract.DAOFactory;

public interface AbstractResource {

    DAOFactory getDaoFactory();
}
