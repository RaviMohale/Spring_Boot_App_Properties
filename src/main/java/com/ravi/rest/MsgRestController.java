package com.ravi.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.props.AppPropertires;

@RestController
public class MsgRestController {

	@Autowired
	private AppPropertires appPros;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return  appPros.getMessage().get("welcomeMsg");
	
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		return appPros.getMessage().get("greetMsg");
			
		
	}
}
