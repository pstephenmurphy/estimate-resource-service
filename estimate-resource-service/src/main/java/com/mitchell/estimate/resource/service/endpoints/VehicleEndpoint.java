/**
 * 
 */
package com.mitchell.estimate.resource.service.endpoints;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.mitchell.entity.manager.EntityManager;
import com.mitchell.estimate.resource.entity.estimate.EstimateType;
import com.mitchell.estimate.resource.entity.vehicle.VehicleInfoType;

/**
 * @author pm104238
 *
 */
@Path("/estimate")
public class VehicleEndpoint extends AbstractEstimateEndpoint {
    
    public VehicleEndpoint(EntityManager<EstimateType, String> entityManager) {
        super(entityManager);
    }

    /**
     * @param id
     * @return
     */
    @GET
    @Path("/{id:[0-9][0-9]*}/vehicleInfo")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") final String id) {
        EstimateType estimate = findEstimate(id);
        VehicleInfoType vehicleInfo = (null != estimate ? estimate.getVehicleInfo() : null);
        
        return getResponse(vehicleInfo);
    }

    /**
     * @param id
     * @param profileinfotype
     * @return
     */
    @PUT
    @Path("/{id:[0-9][0-9]*}/vehicleInfo")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") String id, final VehicleInfoType vehicleInfo) {
        return Response.status(Status.BAD_REQUEST).build();
    }

}
