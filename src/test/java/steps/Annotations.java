package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Annotations {
	@Before 
	public void testConfigSetup (Scenario sce) {	
		System.out.println("****************BEFORE-Start*********************");
		System.out.println(sce.getName()+ " Started");
		System.out.println("****************BEFORE-End*********************");
		System.out.println("");
		
	}
	
	@After
	public void teardown(Scenario sce) {
		System.out.println("****************AFTER-Start*********************8");
		System.out.println(sce.getName()+ " Completed");
		System.out.println("****************AFTER-End*********************");
		System.out.println("");
	}
}
