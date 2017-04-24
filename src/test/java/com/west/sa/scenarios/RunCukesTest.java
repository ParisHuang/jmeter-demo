package com.west.sa.scenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//This is Cucumber Test
@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = {"src/test/resources/features"},
//        tags = {"@base_flow"},
//        plugin = {"pretty","html:target/cucumber"}
//)
@CucumberOptions(format = {"pretty", "html:build/cucumber-html-report", "json-pretty:build/cucumber-report.json"})
public class RunCukesTest {
	
}
