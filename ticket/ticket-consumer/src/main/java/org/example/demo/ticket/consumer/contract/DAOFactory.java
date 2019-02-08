package org.example.demo.ticket.consumer.contract;

import org.example.demo.ticket.consumer.contract.dao.*;

public interface DAOFactory {
    BugDao getBugDao();

    CommentaireDao getCommentaireDao();

    EvolutionDao getEvolutionDao();

    HistoriqueStatutDao getHistoriqueStatutDao();

    NiveauBugDao getNiveauBugDao();

    ProjetDao getProjetDao();

    StatutDao getStatutDao();

    TicketDao getTicketDao();

    UtilisateurDao getUtilisateurDao();

    VersionDao getVersionDao();
}
