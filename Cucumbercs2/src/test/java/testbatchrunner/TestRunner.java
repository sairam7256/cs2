package testbatchrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="Features",glue="stepdef",tags= {"@Cart"},
plugin= { "json:target/Cucumbercs2-json-report.json"} )


public class TestRunner {

}
