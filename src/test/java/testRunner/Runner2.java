package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@tag2"},monochrome=true,glue={"stepDefination"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/Login.html",
		"pretty", "html:target/cucumber-reports"})
public class Runner2 {

}
