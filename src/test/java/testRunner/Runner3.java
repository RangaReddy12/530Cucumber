package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},monochrome=true,tags={"@tag1"},glue={"stepDefinations"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/supplier.html","pretty", "html:target/cucumber-reports"});
public class Runner3 {

}
