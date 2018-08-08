package masterThoughtstepDefinations;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import frameworkClasses.Hooks;

public class Annotations extends Hooks {
	
WebDriver driver;

	@Before 
	public void testConfigSetup (Scenario sce) {
		
		System.out.println(sce.getName());
		
		System.out.println("testOne Started");
		
		WebDriver driver = new Hooks().setBrowser(readConfig("browser"));
		
		driver.manage().window().maximize();
	}
	
	
	


	
	

}
