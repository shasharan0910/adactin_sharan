package com.adactinsite.testrunner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactinsite.baseclass.baseclass;
import com.adactinsite.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactinsite//feature", glue = "com.adactinsite.stepdefinition")

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void set_up() throws Throwable {

		String broswer = File_Reader_Manager.getInstance().grtInstanceCR().get_Browser();
		driver = baseclass.dd(broswer);

	}

	@AfterClass
	public static void tear_Down() {
		driver.close();

	}
}
