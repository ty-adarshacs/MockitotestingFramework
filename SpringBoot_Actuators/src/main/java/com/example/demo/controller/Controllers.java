package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Condb;
import com.example.demo.beans.Employee;

@RestController
public class Controllers {
	
	
	@Value("${mysore.name}")
	String s;
	
	@Autowired
	Environment environment;
	
	@Autowired
	Condb condb;
	Logger logger = LoggerFactory.getLogger(Controllers.class);
	
	@GetMapping("/getting")
	public void getting() {
		System.out.println(environment.getProperty("mysore.name"));
		System.out.println(environment.getProperty("mysore.name"));
		System.out.println(environment.getProperty("mysore.name"));
	
	}

	
	

}
