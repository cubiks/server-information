package com.playground.ws.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.playground.ws.model.Info;

public interface ServerInformation {

	@GET
    @Path("getServerInformation/json/")
    @Produces(MediaType.APPLICATION_JSON)
	Info getServerInformationAsJSON();

	@GET
    @Path("getServerInformation/xml/")
    @Produces(MediaType.APPLICATION_XML)
	Info getServerInformationAsXML();
}
