package org.example.demo.ticket.webapp.rest.resource.ticket;

import org.example.demo.ticket.business.manager.contract.manager.NiveauBugManager;
import org.example.demo.ticket.business.manager.contract.manager.TicketManager;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.bean.ticket.Ticket;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Ressource REST pour les {@link BugNiveau}.
 *
 * @author yRoche
 */
@Path("/niveauBug")
@Produces(MediaType.APPLICATION_JSON)
public class NiveauBugResource extends AbstractResource {

    @GET
    @Path("{niveau}")
    public BugNiveau get(@PathParam("niveau") int pId) throws NotFoundException {
        NiveauBugManager vNiveauBugManager = getManagerFactory().getNiveauBugManager();
        BugNiveau vBugNiveau = vNiveauBugManager.getBugNiveau(pId);
        return vBugNiveau;
    }
    @GET
    @Path("search")
    public List<BugNiveau> search(@QueryParam("ticketId") Integer pProjetId) {
        NiveauBugManager vNiveauBugManager = getManagerFactory().getNiveauBugManager();
        List<BugNiveau> vList = getManagerFactory().getNiveauBugManager().getListBugNiveau();
        return vList;
    }
    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getNiveauBugManager().getCountNiveauBug();
        return nombre;
    }
}
