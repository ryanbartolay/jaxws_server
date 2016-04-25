package com.ryan.runtime;

import javax.xml.ws.Endpoint;

import com.ryan.bom.PersonServiceImpl;

public class SOAPPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ws/person", new PersonServiceImpl());
	}
}
