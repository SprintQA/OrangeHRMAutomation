package com.sprintqa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src\\test\\resources\\feature", 
					glue = "com.sprintqa.stepDef", 
					monochrome = true,
					tags = {"@123"},
					plugin = {"json:target/cucumber.json", "junit:target/cucumber.xml"}
				)
public class Runner {

}


