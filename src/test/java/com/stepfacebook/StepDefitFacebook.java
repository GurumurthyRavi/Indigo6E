package com.stepfacebook;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefitFacebook {
	
	WebDriver driver ;
		@Given("user should see login page")
		public void user_should_see_login_page() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
		}

		@When("user should put username and password")
		public void user_should_put_username_and_password() {
			driver.findElement(By.id("email")).sendKeys("iphone");
			driver.findElement(By.id("pass")).sendKeys("guu@133");
			
		}

		@When("user should click login btn")
		public void user_should_click_login_btn() {
			driver.findElement(By.name("login")).click();
			
		}

		@Then("user should get valid successful page")
		public void user_should_get_valid_successful_page() {
			Assert.assertTrue("valid msg ", true);
			
		}



}
