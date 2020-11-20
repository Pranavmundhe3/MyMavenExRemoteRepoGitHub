package com.lti.demomaven;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.lti.mavenDemo.Welcome;

public class TestWelcome {

	@Test 
	public void testShow() { 
	
	Welcome w= new Welcome(); 
	assertEquals("hello from mavenDemo",w.show()); 
	
	}

}
