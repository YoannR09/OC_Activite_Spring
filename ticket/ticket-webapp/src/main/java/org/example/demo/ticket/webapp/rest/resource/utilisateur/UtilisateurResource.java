package org.example.demo.ticket.webapp.rest.resource.utilisateur;


import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.business.manager.contract.manager.UtilisateurManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.utilisateur.Utilisateur;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Ressource REST pour les {@link Utilisateur}.
 *
 * @author lgu
 */
@Path("/utilisateurs")
@Produces(MediaType.APPLICATION_JSON)
public class UtilisateurResource  extends AbstractResource {

    /**
     * Renvoie le {@link Utilisateur} id {@code pId}
     *
     * @param  pId id du {@link Utilisateur}
     * @return Le {@link Utilisateur}
     * @throws NotFoundException Si le {@link Utilisateur} n'a pas été trouvé
     */
    @GET
    @Path("{id}")
    public Utilisateur get(@PathParam("id") long pId) throws NotFoundException {
        UtilisateurManager vUtilisateurManager = getManagerFactory().getUtilisateurManager();
        Utilisateur vUtilisateur = vUtilisateurManager.getUtilisateur((int) pId);
        return vUtilisateur;
    }

    /**
     * Recherche et renvoie les {@link Ticket} correspondant aux critères.
     *
     * @return List
     */
    @GET
    @Path("list")
    public List<Utilisateur> listUtilisateur() {
        UtilisateurManager vUtilisateurManager = getManagerFactory().getUtilisateurManager();
        List<Utilisateur> vList = vUtilisateurManager.getListUtilisateur();
        return vList;
    }

    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getUtilisateurManager().getCountUtilisateur();
        return nombre;
    }
}
