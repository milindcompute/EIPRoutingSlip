package com.example.JavaFileCopier;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;

public class MyApp {

	public static void main(String[] args) throws Exception {
		CamelContext camelContext = new DefaultCamelContext();
		camelContext.addRoutes(new MyRouteBuilder());
		camelContext.addRoutes(new MyRouteBuilder2());
		camelContext.start();
		ProducerTemplate template = camelContext.createProducerTemplate();
		template.sendBody("direct:start","Normal Customer");
		Thread.sleep(2000);
		template.sendBody("direct:start","Premium Customer");
		Thread.sleep(2000);
		template.sendBody("direct:start2","Normal Customer");
		Thread.sleep(2000);
		template.sendBody("direct:start2","Premium Customer");
	}

}
