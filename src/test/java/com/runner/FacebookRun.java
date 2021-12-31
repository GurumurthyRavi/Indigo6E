package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\GURUMURTHY\\eclipse-workspace\\CucumberFacebook\\src\\"
		+ "test\\resources\\Feature\\Facebook.feature"}, glue = {"com.stepfacebook"})
public class FacebookRun {

}
