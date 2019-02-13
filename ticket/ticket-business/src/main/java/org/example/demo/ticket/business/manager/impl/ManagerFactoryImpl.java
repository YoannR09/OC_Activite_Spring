package org.example.demo.ticket.business.manager.impl;

import org.example.demo.ticket.business.manager.contract.ManagerFactory;
import org.example.demo.ticket.business.manager.contract.manager.*;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class ManagerFactoryImpl implements ManagerFactory {

    @Inject
    public  ManagerFactoryImpl(ProjetManager pProjetManager,
                               TicketManager pTicketManager,BugManager pBugManager,
                               CommentaireManager pCommentaireManager,EvolutionManager pEvolutionManager,
                               NiveauBugManager pNiveauBugManager,StatutManager pStatutManager,
                               UtilisateurManager pUilisateurManager,VersionManager pVersionManager) {
        this.projetManager = pProjetManager;
        this.ticketManager = pTicketManager;
        this.bugManager = pBugManager;
        this.commentaireManager = pCommentaireManager;
        this.evolutionManager = pEvolutionManager;
        this.niveauBugManager = pNiveauBugManager;
        this.statutManager = pStatutManager;
        this.utilisateurManager = pUilisateurManager;
        this.versionManager = pVersionManager;
    }

    @Inject
    private BugManager bugManager;
    @Override
    public BugManager getBugManager() {
        return this.bugManager;
    }
    public void setBugManager(BugManager pBugManager){
        bugManager = pBugManager;
    }

    @Inject
    private CommentaireManager commentaireManager;
    @Override
    public CommentaireManager getCommentaireManager() {
        return this.commentaireManager;
    }
    public void setCommentaireManager(CommentaireManager pCommentaireManager){
        commentaireManager = pCommentaireManager;
    }

    @Inject
    private EvolutionManager evolutionManager;
    @Override
    public EvolutionManager getEvolutionManager() {
        return null;
    }

    @Inject
    private NiveauBugManager niveauBugManager;
    @Override
    public NiveauBugManager getNiveauBugManager() {
        return this.niveauBugManager;
    }
    public void setNiveauBugManager(NiveauBugManager pNiveauBugManager){
        niveauBugManager = pNiveauBugManager;
    }

    @Inject
    private ProjetManager projetManager;
    @Override
    public ProjetManager getProjetManager() {
        return this.projetManager;
    }
    public void setProjetManager(ProjetManager pProjetManager){
        projetManager = pProjetManager;
    }

    @Inject
    private StatutManager statutManager;
    @Override
    public StatutManager getStatutManager() {
        return this.statutManager;
    }
    public void setStatutManager(StatutManager pStatutManager){
        statutManager = pStatutManager;
    }

    @Inject
    private TicketManager ticketManager;
    @Override
    public TicketManager getTicketManager() {
        return this.ticketManager;
    }
    public void setTicketManager(TicketManager pTicketManager){
        ticketManager = pTicketManager;
    }

    @Inject
    private UtilisateurManager utilisateurManager;
    @Override
    public UtilisateurManager getUtilisateurManager() {
        return this.utilisateurManager;
    }
    public void setUtilisateurManager(UtilisateurManager pUtilisateurManager) {
        this.utilisateurManager = pUtilisateurManager;
    }

    @Inject
    private VersionManager versionManager;
    @Override
    public VersionManager getVersionManager() {
        return this.versionManager;
    }

    public void setVersionManager(VersionManager pVersionManager) {
        this.versionManager = pVersionManager;
    }
}
