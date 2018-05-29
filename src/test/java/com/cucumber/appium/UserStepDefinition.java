package com.cucumber.appium;

import com.cucumber.appium.steps.UserSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class UserStepDefinition {
	@Steps
	UserSteps endUser;

	@Given("^I am logged in as a \"([^\"]*)\" user in SSO$")
	public void i_am_logged_in_as_a_user_in_SSO(String userType) {
		endUser.initialize_android_driver();
		endUser.sroll_down_in_appium();
		endUser.android_key_event();
		endUser.gestures_drag_and_drop();
		endUser.gestures_tap_and_press();
		endUser.locator_ui_automator_test();
		endUser.android_swipe_gestures();
		endUser.raaga_e2e_test();
		endUser.hybrid_e2e_test();
		//endUser.gaana_app();
	}

}
