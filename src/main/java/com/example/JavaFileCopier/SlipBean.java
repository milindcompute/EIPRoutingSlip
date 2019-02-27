package com.example.JavaFileCopier;

import org.apache.camel.RoutingSlip;

public class SlipBean {

	@RoutingSlip
	public String compute(String body) {
		String answer = "direct:basicServicing2";
		if (body.contains("Premium")) {
			answer += ",direct:premiumservicing2";
		}
		return answer;
	}

}
