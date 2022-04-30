package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Feature", glue={"stepdefination"},
plugin= {"pretty","html:target/reports/cucmber.html","junit:target/reports/cucumber.html","json:target/cucumber.json"}, monochrome = true)
//testing code step 3
//Testing for 6
public class testrunner {
		
	
}
