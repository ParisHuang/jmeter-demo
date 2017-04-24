package com.west.sa.scenarios;

import cucumber.api.java.en.Given;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then; 
import cucumber.api.java.en.When;
//import gherkin.formatter.model.Scenario;

import cucumber.api.Scenario;

import com.west.sa.JMeterFactory;

public class AbsenceFlowSteps {
	private int usersNum;
	private int durationNum;
	private Scenario scenario;
	
//	@Before
//	public void before(Scenario scenario) {
//	    this.scenario = scenario;
//	}
	
//	@After
//	public void After(){
//		scenario.getName();
//	}
	
	@Given("^(\\d+) threads is loaded")
	public void givenAllThreadsIsLoaded(int num) {
		usersNum=num;
	}
	
	@And("^ramp-up period is set to (\\d+) second")
	public void rampupPeriodIsSeted(int num) {
		
	}
	
	@And("^duration run time is set to (\\d+) second")
	public void durationTimeIsSeted(int num) {
		durationNum=num;
	}
	
	@When("^(\\d+) guardian login system and call get user options api")
	public void callGetUserOptions(int num) throws Exception {
		JMeterFactory jMeterFactory = new JMeterFactory();
		jMeterFactory.ExecuteExistingJmx("baidu.jmx",usersNum,durationNum);
	}
	
	@And("^call create absence api")
	public void callCreateAbsenceApi() {
		
	}
	
	@And("^if create absence successfully")
	public void ifCreateSuccessfully() {
		
	}
	
	@Then("^call edit absence item")
	public void callEditAbsence() {
		
	}
	
	@And("^call delete absence item")
	public void callDeleteAbsence() {
		
	}
	
	@Then("^verify the response time for all call api")
	public void verifyResponseTime() {
		
	}
	
	
}
