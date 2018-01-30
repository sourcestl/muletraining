package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;

//@Ignore
public class HelloMavenTest extends org.mule.tck.junit4.FunctionalTestCase {

	
	@Test
	public void mavenFLo()throws Exception{
		runFlowAndExpect("mavenFlow", "HELLO WORLD");
	}
	@Override
	protected String getConfigFile(){
		return "maven-project.xml";
	}
	
	 @Test
	 public void retrieveFlightsAddsAppropriateHeader() throws Exception {
	   MuleEvent event = runFlow("retrieveFlights");
	   String contentType = event.getMessage().getOutboundProperty("Content-Type");
	   assertEquals("application/json", contentType);
	 }

}
