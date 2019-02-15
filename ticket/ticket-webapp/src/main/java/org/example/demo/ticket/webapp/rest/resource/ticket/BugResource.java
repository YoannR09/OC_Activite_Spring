package org.example.demo.ticket.webapp.rest.resource.ticket;


import org.example.demo.ticket.business.manager.contract.manager.BugManager;
import org.example.demo.ticket.business.manager.contract.manager.NiveauBugManager;
import org.example.demo.ticket.model.bean.ticket.Bug;
import org.example.demo.ticket.model.bean.ticket.BugNiveau;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/bug")
@Produces(MediaType.APPLICATION_JSON)
public class BugResource extends AbstractResource {

    @GET
    @Path("{id}")
    public Bug get(@PathParam("id") int pId) throws NotFoundException {
        BugManager vBugManager = getManagerFactory().getBugManager();
        Bug vBug = vBugManager.getBug(pId);
        return vBug;
    }
    @GET
    @Path("search")
    public List<Bug> search(@QueryParam("ticketId") Integer pProjetId) {
        BugManager vBugManager = getManagerFactory().getBugManager();
        List<Bug> vList = vBugManager.getListBug();
        return vList;
    }
    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getBugManager().getCountBug();
        return nombre;
    }
}
