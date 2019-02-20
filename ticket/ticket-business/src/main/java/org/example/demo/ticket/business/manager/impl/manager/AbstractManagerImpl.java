package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.business.manager.contract.manager.AbstractResource;
import org.example.demo.ticket.consumer.contract.DAOFactory;

import javax.inject.Inject;
import javax.inject.Named;

// @Named
public abstract class AbstractManagerImpl { //implements AbstractResource {

   // @Inject
    private static DAOFactory daoFactory;

    public DAOFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DAOFactory pDAOFactory) {
        daoFactory = pDAOFactory;
    }
}
