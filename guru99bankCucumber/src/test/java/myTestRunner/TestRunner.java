package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",
		glue="stepDefinition",
		dryRun=false,
		plugin= {"pretty","html:target/htmlreports","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"},
		monochrome=true
		)		
//"pretty","html:target/htmlreports" ---- this is to generate html format report
//"json:json_output/cucumber.json" ---- this is to generate json format report
//"junit:junit_xml_output/cucumber.xml"  -----  this is to generate xml format report
public class TestRunner {

}
