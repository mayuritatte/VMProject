package com.ibm.TestRunnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features=".\\Features\\login.feature",
		glue="com.ibm.stepDef",
		monochrome =true,  // remove junk output
//		dryRun=true,  //to check missing codes  
		plugin= {"pretty", "html: CucumberReports"}
		)
public class TestRunner {
	
}
