package day_22;

import org.junit.runner.RunWith;

import cucumber.api.junit.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue = "steps")

public class TestRunner {

}
