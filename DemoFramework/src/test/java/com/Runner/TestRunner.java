package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features=".\\Features\\HRMlogin.feature",
glue="com.stepDefination", 
monochrome =true,
plugin= {"pretty", "html: cucumberReport1"}
		
		
		)

public class TestRunner {

}
