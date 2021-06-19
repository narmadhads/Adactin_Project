package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinProj.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.step", 
monochrome=true, 
dryRun= false, 
strict=true,
tags=("@SmokeTest, @SanityTest"),
plugin= {"html:Report/HTML_Report",
		"pretty",
		"json:Report/CucumberJSON_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html"
}

)
public class Test_Runner1 {
	public static WebDriver driver;

	@BeforeClass
	public static void set_Up() {
		driver= BaseClass.browserLaunch("chrome");
	}

	@AfterClass
	public static void tear_Down() {
	//	driver.close();
	}
}
