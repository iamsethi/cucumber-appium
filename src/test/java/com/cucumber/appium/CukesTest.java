package com.cucumber.appium;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.appium.steps.WordPressLoginSteps;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import static com.cucumber.appium.AppiumServerController.startAppiumServer;
import static com.cucumber.appium.AppiumServerController.stopAppiumServer;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/invalid_login.feature", plugin = { "pretty",
		"json:target/cucumber_json/reports.html" })
public class CukesTest {

	@Managed(uniqueSession = false)
	public WebDriver webdriver;

	@Steps
	public WordPressLoginSteps userSteps;

	@BeforeClass
	public static void startAppium() {
		startAppiumServer();
	}

	@AfterClass
	public static void stopAppium() {
		stopAppiumServer();
	}

	// @Test
	public void verifyInvalidLogin() {
		try {
			userSteps.loginPageInvalidDataInput();
			userSteps.enterLoginData();
			userSteps.checkErrorMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
