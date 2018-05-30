package com.cucumber.appium.steps;

import com.cucumber.appium.page.WordPressLoginPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class WordPressLoginSteps extends ScenarioSteps {
	WordPressLoginPage loginPage;

	@Step
	public void loginPageInvalidDataInput() {
		loginPage.gotoWPLoginPage();
	}

	@Step
	public void enterLoginData() {
		loginPage.enterInvalidEmailIdWPLoginPage();
	}

	@Step
	public void checkErrorMessage() {
		assertThat(loginPage.isErrorMessageShownWPLoginPage()).isTrue();
	}

}