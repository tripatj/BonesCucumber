package utilClasses;

import org.openqa.selenium.WebDriver;

import frameworkClasses.Hooks;

public class GenericUtility {
	
	public WebDriver driver;
	
	public GenericUtility () {
		this.driver=Hooks.driver;
		
		
	}

}
