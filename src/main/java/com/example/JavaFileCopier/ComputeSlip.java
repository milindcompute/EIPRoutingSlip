package com.example.JavaFileCopier;

public class ComputeSlip {
	 public String compute(String body) {
	 String answer = "direct:basicServicing";
	 if (body.contains("Premium")) {
	 answer += ",direct:premiumservicing";
	 }
	 return answer;
	}
}
