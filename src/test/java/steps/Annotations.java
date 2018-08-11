package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import frameworkClasses.Hooks;

public class Annotations extends Hooks {
	WebDriver driver;
	@Before 
	public void testConfigSetup (Scenario sce) {	
		System.out.println("****************BEFORE-Start*********************");
		System.out.println(sce.getName()+ " Started");
		driver = setBrowser(readConfig("browser"));
		driver.navigate().to("https://github.com/");
		
		System.out.println("****************BEFORE-End*********************");
		System.out.println("");
		
	}
	
	@After
	public void teardown(Scenario sce) {
		System.out.println("****************AFTER-Start*********************8");
		System.out.println(sce.getName()+ " Completed");
		driver.close();
		System.out.println("****************AFTER-End*********************");
		System.out.println("");
	}
}
