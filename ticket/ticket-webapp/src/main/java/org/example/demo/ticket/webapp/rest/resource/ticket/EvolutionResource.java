package org.example.demo.ticket.webapp.rest.resource.ticket;

import org.example.demo.ticket.business.manager.contract.manager.EvolutionManager;
import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Evolution;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Ressource REST pour les {@link Evolution}.
 *
 * @author lgu
 */
@Path("/evolution")
@Produces(MediaType.APPLICATION_JSON)
public class EvolutionResource extends AbstractResource {


    /**
     * Renvoie le {@link Evolution} de numéro {@code pId}
     *
     * @param pId id du {@link Evolution}
     * @return Le {@link Evolution}
     * @throws NotFoundException Si le {@link Evolution} n'a pas été trouvé
     */
    @GET
    @Path("{id}")
    public Evolution get(@PathParam("id") int pId) throws NotFoundException {
        EvolutionManager vEvolutionManager = getManagerFactory().getEvolutionManager();
        Evolution vEvolution = vEvolutionManager.getEvolution(pId);
        return vEvolution;
    }

    /**
     * @return List
     */
    @GET
    @Path("list")
    public List<Evolution> getListEvolution() {
        EvolutionManager vEvolutionManager = getManagerFactory().getEvolutionManager();
        List<Evolution> vList = vEvolutionManager.getListEvolution();
        return vList;
    }

    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getEvolutionManager().getCountEvolution();
        return nombre;
    }
}
