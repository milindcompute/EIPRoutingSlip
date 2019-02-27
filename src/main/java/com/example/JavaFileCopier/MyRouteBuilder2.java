package com.example.JavaFileCopier;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder2 extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("direct:start2")
		 .bean(SlipBean.class);
		
		from("direct:basicServicing2").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				System.out.println("Basic Servicing2");
				
			}
		});
		from("direct:premiumservicing2").process(new Processor() {
			
			public void process(Exchange exchange) throws Exception {
				System.out.println("premium Servicing2");
				
			}
		});
	}
}
