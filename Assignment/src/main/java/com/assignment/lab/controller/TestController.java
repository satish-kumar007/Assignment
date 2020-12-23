package com.assignment.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.lab.service.TestService;


@RestController
public class TestController {
	
	@Autowired
	TestService service;
	
	@Autowired
	Environment env;
	
	@GetMapping(value = "/status/check")
	public String status() {
		return "Working on port no ... "+env.getProperty("local.server.port")+" with secret token: "+env.getProperty("token.secret");
	}

	@GetMapping("/getByNames")
	public ResponseEntity<Object> byName() {
		return new ResponseEntity<>(service.getByNameAsc(), HttpStatus.OK);
	}
	
	@GetMapping("/getByDistrictCode")
	public ResponseEntity<Object> byDistrictCode() {
		return new ResponseEntity<>(service.getByDistrictAsc(), HttpStatus.OK);
	}

	
	@GetMapping("/getByStateCode")
	public ResponseEntity<Object> byStateCode() {
		return new ResponseEntity<>(service.getByStateAsc(), HttpStatus.OK);
	}
	
	@GetMapping("/getHospitalByCode/{code}")
	public ResponseEntity<Object> byHospitalByCode(@PathVariable String code) {
		return new ResponseEntity<>(service.byHospitalByCode(code), HttpStatus.OK);
	}


	
}
