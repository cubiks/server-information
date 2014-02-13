package com.playground.ws.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.playground.ws.service.ServerInformation;

public class ServerInformationImpl implements ServerInformation {

	@Override
	public Map<String, String> getServerInformation() {
		final Map<String, String> serverInformation = new HashMap<String, String>();
		serverInformation.put("version", "0.1");
		serverInformation.put("ip", "127.0.0.1");
		serverInformation.put("host", "localhost");
		return serverInformation;
	}

}
