package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallingProperties
{

	@Value("${message}")
	private String message;
	
	/*
	 * @Value("${message}") private String message;
	 * 
	 * @RequestMapping("/value") public String read() { System.out.println(name);
	 * return name+ " " +message; }
	 */
	
	@GetMapping("/message")
    public String getMsg() {
        return this.message;
    }
}
