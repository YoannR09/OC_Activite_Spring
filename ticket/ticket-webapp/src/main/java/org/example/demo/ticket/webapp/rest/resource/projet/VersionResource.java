package org.example.demo.ticket.webapp.rest.resource.projet;


import org.example.demo.ticket.business.manager.contract.manager.VersionManager;
import org.example.demo.ticket.model.bean.projet.Projet;
import org.example.demo.ticket.model.bean.projet.Version;
import org.example.demo.ticket.model.exception.NotFoundException;
import org.example.demo.ticket.webapp.rest.resource.AbstractResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Ressource REST pour les {@link Version}.
 *
 * @author lgu
 */
@Path("/version")
@Produces(MediaType.APPLICATION_JSON)
public class VersionResource extends AbstractResource {

    /**
     * Renvoie le {@link Version} d'identifiant {@code pId}
     *
     * @param pId identifiant du {@link Version}
     * @return Le {@link Version}
     * @throws NotFoundException Si le {@link Version} n'a pas été trouvé
     */
    @GET
    @Path("{id}")
    public Version get(@PathParam("id") Integer pId) throws NotFoundException {
        VersionManager vVersionManager = getManagerFactory().getVersionManager();
        Version vVersion = vVersionManager.getVersion(pId);
        return vVersion;
    }


    /**
     * Renvoie tous les {@link Projet}
     *
     * @return List
     */
    @GET
    @Path("{list}")
    public List<Version> get() {
        VersionManager vVersionManager = getManagerFactory().getVersionManager();
        List<Version> vListVersion = vVersionManager.getListVersion();
        return vListVersion;
    }

    @GET
    @Path("count")
    public int getCount(int nombre) {
        nombre = getManagerFactory().getVersionManager().getCountVersion();
        return nombre;
    }
}