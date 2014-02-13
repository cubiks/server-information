package com.playground.ws;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.cxf.interceptor.AbstractOutDatabindingInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

public class AccessControlInterceptor extends AbstractOutDatabindingInterceptor {

	public AccessControlInterceptor() {
		super(Phase.MARSHAL);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		@SuppressWarnings({ "unchecked" })
		Map<String, List<String>> headers = (Map<String, List<String>>) message.get(Message.PROTOCOL_HEADERS);
		if (headers == null) {
			headers = new TreeMap<String, List<String>>(String.CASE_INSENSITIVE_ORDER);
			message.put(Message.PROTOCOL_HEADERS, headers);
		}
		headers.put("Cache-Control", Collections.singletonList("no-cache"));
		headers.put("Access-Control-Allow-Origin", Collections.singletonList("*"));
	}
}
