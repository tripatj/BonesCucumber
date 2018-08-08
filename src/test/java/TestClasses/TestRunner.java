package TestClasses;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(		
	features="src/test/java/featureFiles",
	glue= {"masterThoughtstepDefinations"},
	plugin= {"pretty","html:target/htmlreports" }		
)



public class TestRunner {
	
    }
