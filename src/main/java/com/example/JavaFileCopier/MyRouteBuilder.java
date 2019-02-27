package com.example.JavaFileCopier;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:start")
		 .routingSlip(method(ComputeSlip.class));
		
		from("direct:basicServicing").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				System.out.println("Basic Servicing");
				
			}
		});
		from("direct:premiumservicing").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				System.out.println("premium Servicing");
				
			}
		});
	}
}
