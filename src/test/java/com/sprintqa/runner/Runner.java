package com.sprintqa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src\\test\\resources\\feature", 
					glue = "com.sprintqa.stepDef", 
					monochrome = true,
					dryRun = true,
					tags = {"@wip"},
					plugin = {"json:target/cucumber.json", "junit:target/cucumber.xml"}
				)
public class Runner {

}
