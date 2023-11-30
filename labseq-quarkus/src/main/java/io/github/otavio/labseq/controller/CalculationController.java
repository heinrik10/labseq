package io.github.otavio.labseq.controller;

import io.github.otavio.labseq.service.CalculationService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.math.BigInteger;

@Path("/calculate")
@Produces(MediaType.APPLICATION_JSON)
public class CalculationController {

    @Inject
    public CalculationService service;

    @GET
    @Path("/{number}")
    public Response calculateNumbersTeste(@PathParam("number") BigInteger number){
        try {
            return Response.ok(service.calcularL(number)).build();
        } catch (Exception e){
            return Response.status(400, "Number must be integer and positive.").build();
        }
    }
}
