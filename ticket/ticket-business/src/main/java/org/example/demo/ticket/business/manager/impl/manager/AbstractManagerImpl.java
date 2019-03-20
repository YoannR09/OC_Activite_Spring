package org.example.demo.ticket.business.manager.impl.manager;

import org.example.demo.ticket.consumer.contract.DAOFactory;


public abstract class AbstractManagerImpl {

    private static DAOFactory daoFactory;

    public DAOFactory getDaoFactory() {
        return daoFactory;
    }

    public static void setDaoFactory(DAOFactory pDAOFactory) {
        daoFactory = pDAOFactory;
    }
}
