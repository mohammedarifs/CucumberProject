package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Feature", glue={"stepdefination"},
plugin= {"pretty","html:target/reports/cucmber.html","junit:target/reports/cucumber.html","json:target/cucumber.json"}, monochrome = true)

//No testing
public class testrunner {
		
	
}
