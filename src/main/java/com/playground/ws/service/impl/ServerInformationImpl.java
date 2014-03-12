package com.playground.ws.service.impl;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.InetAddress;
import java.net.UnknownHostException;
import com.playground.ws.model.Info;
import com.playground.ws.service.ServerInformation;

public class ServerInformationImpl implements ServerInformation {

	@Override
	public Info getServerInformationAsJSON() {
		return getServerInformation();
	}

	@Override
	public Info getServerInformationAsXML() {
		return getServerInformation();
	}

	private Info getServerInformation() {
		String hostname = "";
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		final String platform	= "";
		final String arch		= "";
		final RuntimeMXBean rb	= ManagementFactory.getRuntimeMXBean();
		final String release 	= "";
		final String type		= "";
		final long uptime		= rb.getUptime();
		final long loadavg		= 0;
		final long totalmem		= Runtime.getRuntime().totalMemory();
		final long freemem		= Runtime.getRuntime().freeMemory();
		final int cpus			= Runtime.getRuntime().availableProcessors();

		final Info serverInformation = new Info();
		serverInformation.setHostname(hostname);
		serverInformation.setPlatform(platform);
		serverInformation.setArch(arch);
		serverInformation.setRelease(release);
		serverInformation.setType(type);
		serverInformation.setUptime(uptime);
		serverInformation.setLoadavg(loadavg);
		serverInformation.setTotalmem(totalmem);
		serverInformation.setFreemem(freemem);
		serverInformation.setCpus(cpus);
		
		return serverInformation;
	}
}
