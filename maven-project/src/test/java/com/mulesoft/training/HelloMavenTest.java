package com.mulesoft.training;

import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class HelloMavenTest extends org.mule.tck.junit4.FunctionalTestCase {

	
	@Test
	public void mavenFLo()throws Exception{
		runFlowAndExpect("mavenFlow", "HELLO WORLD");
	}
	@Override
	protected String getConfigFile(){
		return "maven-project.xml";
	}
}
