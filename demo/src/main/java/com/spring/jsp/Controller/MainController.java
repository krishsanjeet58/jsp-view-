package com.spring.jsp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.core.net.SyslogOutputStream;

@Controller
public class MainController {

	@RequestMapping("/")
	public String Home() {
		
		System.out.println("this is home page");
		return "home";
	}
	
	@RequestMapping("/contect")
	public String contect() {
		
		System.out.print(" this is contect ");
		return"Contect";
	}
}
