package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	

	   @RequestMapping(value="/controller", method=RequestMethod.GET)
	   public String foo() {
	      return "Hello Kubernetes!";
	   }
}
