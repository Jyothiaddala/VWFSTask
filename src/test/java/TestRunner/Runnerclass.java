package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "/Users/Jyothiaddala/Documents/JavaTraining/VWFSTask/src/main/java/Features/Vehicle.Feature",
		glue = {"Stepdefs"},
		format = {"pretty","html:test-outout"},
		monochrome = true, 
		strict = true,
		dryRun =false
		)

public class Runnerclass {

}
