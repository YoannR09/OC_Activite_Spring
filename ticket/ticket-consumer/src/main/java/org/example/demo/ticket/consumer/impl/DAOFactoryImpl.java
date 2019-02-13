package org.example.demo.ticket.consumer.impl;

import org.example.demo.ticket.consumer.contract.DAOFactory;
import org.example.demo.ticket.consumer.contract.dao.*;

import javax.inject.Inject;
import javax.inject.Named;

@Named("daoFactoryImpl")
public class DAOFactoryImpl implements DAOFactory {

    @Inject
    private BugDao bugDao;
    @Override
    public BugDao getBugDao() {
        return this.bugDao;
    }
    public void setBugDao(BugDao pBugDao){
        bugDao = pBugDao;
    }

    @Inject
    private CommentaireDao commentaireDao;
    @Override
    public CommentaireDao getCommentaireDao() {
        return this.commentaireDao;
    }
    public void setCommentaireDao(CommentaireDao pCommentaireDao) {
        this.commentaireDao = pCommentaireDao;
    }

    @Inject
    private EvolutionDao evolutionDao;
    @Override
    public EvolutionDao getEvolutionDao() {
        return this.evolutionDao;
    }
    public void setEvolutionDao(EvolutionDao pEvolutionDao) {
        this.evolutionDao = pEvolutionDao;
    }

    @Inject
    private HistoriqueStatutDao historiqueStatutDao;
    @Override
    public HistoriqueStatutDao getHistoriqueStatutDao() {
        return this.historiqueStatutDao;
    }
    public void setHistoriqueStatutDao(HistoriqueStatutDao pHistoriqueStatutDao){
        historiqueStatutDao = pHistoriqueStatutDao;
    }

    @Inject
    private NiveauBugDao niveauBugDao;
    @Override
    public NiveauBugDao getNiveauBugDao() {
        return this.niveauBugDao;
    }
    public void setNiveauBugDao(NiveauBugDao pNiveauBugDao) {
        this.niveauBugDao = pNiveauBugDao;
    }

    @Inject
    private ProjetDao projetDao;
    @Override
    public ProjetDao getProjetDao() {
        return this.projetDao;
    }

    public void setProjetDao(ProjetDao pProjetDao) {
        this.projetDao = pProjetDao;
    }

    @Inject
    private StatutDao statutDao;
    @Override
    public StatutDao getStatutDao() {
        return this.statutDao;
    }

    public void setStatutDao(StatutDao pStatutDao) {
        this.statutDao = pStatutDao;
    }

    @Inject
    private TicketDao ticketDao;
    @Override
    public TicketDao getTicketDao() {
        return this.ticketDao;
    }

    public void setTicketDao(TicketDao pTicketDao) {
        this.ticketDao = pTicketDao;
    }

    @Inject
    private UtilisateurDao utilisateurDao;
    @Override
    public UtilisateurDao getUtilisateurDao() {
        return this.utilisateurDao;
    }

    public void setUtilisateurDao(UtilisateurDao pUtilisateurDao) {
        this.utilisateurDao = pUtilisateurDao;
    }

    @Inject
    private VersionDao versionDao;
    @Override
    public VersionDao getVersionDao() {
        return this.versionDao;
    }

    public void setVersionDao(VersionDao pVersionDao) {
        this.versionDao = pVersionDao;
    }
}
