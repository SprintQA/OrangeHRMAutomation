package com.sprintqa.stepDef;

import com.sprintqa.utils.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before
	public void setup() {
		BaseClass.setUp();
	}

	@After
	public void quit() {
		BaseClass.getWebDriver().quit();
	}

}
