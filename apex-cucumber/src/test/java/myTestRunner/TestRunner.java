package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features/GoogleSearch.feature",
				 glue="stepDefinition", monochrome=true)
public class TestRunner {

}
