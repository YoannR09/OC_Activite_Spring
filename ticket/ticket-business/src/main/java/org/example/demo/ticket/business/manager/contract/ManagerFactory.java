package org.example.demo.ticket.business.manager.contract;

import org.example.demo.ticket.business.manager.contract.manager.*;

public interface ManagerFactory {

    BugManager getBugManager();

    CommentaireManager getCommentaireManager();

    EvolutionManager getEvolutionManager();

    NiveauBugManager getNiveauBugManager();

    ProjetManager getProjetManager();

    StatutManager getStatutManager();

    TicketManager getTicketManager();

    UtilisateurManager getUtilisateurManager();

    VersionManager getVersionManager();

}
