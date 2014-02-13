package com.playground.ws.service;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface ServerInformation {

	@GET
    @Path("getServerInformation/")
    @Produces(MediaType.APPLICATION_JSON)
	Map<String, String> getServerInformation();
}
