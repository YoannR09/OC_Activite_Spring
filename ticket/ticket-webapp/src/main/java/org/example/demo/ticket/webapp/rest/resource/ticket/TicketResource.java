package org.example.demo.ticket.webapp.rest.resource.ticket;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.model.recherche.ticket.RechercheTicket;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;


/**
 * Ressource REST pour les {@link Ticket}.
 *
 * @author lgu
 */
@Path("/tickets")
@Produces(MediaType.APPLICATION_JSON)
public class TicketResource extends AbstractResource {


    /**
     * Renvoie le {@link Ticket} de numéro {@code pNumero}
     *
     * @param pNumero numéro du {@link Ticket}
     * @return Le {@link Ticket}
     * @throws NotFoundException Si le {@link Ticket} n'a pas été trouvé
     */
    @GET
    @Path("{numero}")
    public Ticket get(@PathParam("numero") long pNumero) throws NotFoundException {
        TicketManager vTicketManager = getManagerFactory().getTicketManager();
        Ticket vTicket = vTicketManager.getTicket(pNumero);
        return vTicket;
    }

    /**
     * Recherche et renvoie les {@link Ticket} correspondant aux critères.
     *
     * @return List
     */
    @GET
    @Path("list")
    public List<Ticket> getListTicket() {
        TicketManager vTicketManager = getManagerFactory().getTicketManager();
        List<Ticket> vList = vTicketManager.getListTicket();
        System.out.println("list projet : "+ vList);
        return vList;
    }

    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getTicketManager().getCountTicket();
        return nombre;
    }
}