package org.example.demo.ticket.webapp.rest.resource.ticket;

import org.example.demo.ticket.business.manager.contract.manager.StatutManager;
import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.bean.ticket.TicketStatut;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Ressource REST pour les {@link Ticket}.
 *
 * @author lgu
 */
@Path("/ticketStatut")
@Produces(MediaType.APPLICATION_JSON)
public class TicketStatutResource extends AbstractResource {


    /**
     * Renvoie le {@link TicketStatut} de numéro {@code pNumero}
     *
     * @param pId numéro du {@link TicketStatut}
     * @return Le {@link TicketStatut}
     * @throws NotFoundException Si le {@link TicketStatut} n'a pas été trouvé
     */
    @GET
    @Path("{id}")
    public TicketStatut get(@PathParam("id") int pId) throws NotFoundException {
        StatutManager vStatutManager = getManagerFactory().getStatutManager();
        TicketStatut vStatut = vStatutManager.getTicketStatut(pId);
        return vStatut;
    }

    /**
     * Recherche et renvoie les {@link Ticket} correspondant aux critères.
     *
     * @return List
     */
    @GET
    @Path("list")
    public List<TicketStatut> getListTicketStatut() {
        StatutManager vStatutManager = getManagerFactory().getStatutManager();
        List<TicketStatut> vListStatut = vStatutManager.getListTicketStatut();
        return vListStatut;
    }

    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getStatutManager().getCountStatut();
        return nombre;
    }
}