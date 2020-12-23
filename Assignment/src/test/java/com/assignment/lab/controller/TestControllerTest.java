package com.assignment.lab.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.assignment.lab.service.TestService;

public class TestControllerTest {
	
	@InjectMocks
	TestController controller;
	
	@Mock
	TestService service;
	
	@Before
	public void initMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test 
	public void testbyName() throws Exception {
		
		when(service.getByNameAsc()).thenReturn(new Object());
		ResponseEntity<Object> actual=controller.byName();
		ResponseEntity<Object> expected=new ResponseEntity<>(new Object(),HttpStatus.OK);		
		assertEquals(expected,actual);		  
	}

}
