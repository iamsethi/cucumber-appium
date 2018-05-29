package com.cucumber.appium.steps;

import java.util.Set;

import org.openqa.selenium.Point;

import com.cucumber.appium.page.APIDemoAppPageObject;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.WebDriverFacade;

public class UserSteps extends PageObject {

	AndroidDriver<AndroidElement> driver;
	APIDemoAppPageObject apiDemoPage;

	

	@Step
	public void initialize_android_driver() {
		driver = ((AndroidDriver<AndroidElement>) ((WebDriverFacade) getDriver()).getProxiedDriver());

	}

	@Step
	public void sroll_down_in_appium() {
		apiDemoPage.text_views_ui_automator.click();
		apiDemoPage.webview_ui_automator.click();
	}

	@Step
	public void android_key_event() {
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isLocked());
		// driver.hideKeyboard();
		apiDemoPage.views.click();

		// KEY EVENT
		driver.pressKeyCode(AndroidKeyCode.BACK);
	}

	public void gestures_drag_and_drop() {
		TouchAction t = new TouchAction(driver);
		apiDemoPage.views.click();
		apiDemoPage.drag_and_drop.click();

		t.longPress(driver.findElementsByClassName("android.view.View").get(0))
				.moveTo(driver.findElementsByClassName("android.view.View").get(1)).release().perform();

	}

	public void gestures_tap_and_press() {
		apiDemoPage.views.click();
		// Tap
		TouchAction t = new TouchAction(driver);
		t.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		// Simple Click
		apiDemoPage.custom_adapter.click();
		// Press
		t.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).perform();
		System.out.println(driver.findElementById("android:id/alertTitle").getText());

	}

	public void locator_ui_automator_test() {
		// driver.findElementByAndroidUIAutomator("(attribute("value"))");
		apiDemoPage.text_views_ui_automator.click();
		// driver.findElementByAndroidUIAutomator("new
		// UiSelector.property(value)");
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());

	}

	public void android_swipe_gestures() {
		TouchAction t = new TouchAction(driver);
		apiDemoPage.views.click();
		apiDemoPage.date_widgets.click();
		apiDemoPage.txt_inline_ui_automator.click();
		apiDemoPage.content_desc.click();
		t.press(driver.findElementByXPath("//*[@content-desc='15']"))
				.moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();

	}

	public void raaga_e2e_test() {
		// driver.findElementByClassName("android.widget.LinearLayout").click();
		// driver.findElementById("com.raaga.android:id/landing_skip_to_raaga").click();
		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();

		// driver.findElementByAndroidUIAutomator(
		// "new UiScrollable(new UiSelector()).scrollIntoView(tag(\"webview\"));");
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(resourceId(\"com.raaga.android:id/music_home_raaga_live\"));");
		driver.findElementById("com.raaga.android:id/music_home_raaga_live").click();
		driver.findElementById("com.raaga.android:id/toolbar_logo").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Settings']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Push Notification']").click();

		Point point = driver.findElementById("com.raaga.android:id/toggle_notifyrecommend").getLocation();
		TouchAction t = new TouchAction(driver);
		// toggle on
		t.tap(point.x + 20, point.y + 30).perform();
		// toggle off
		t.tap(point.x + 100, point.y + 30).perform();

		// Previous//appium version older- scrollTo()

	}

	public void hybrid_e2e_test() {
		// System.out.println(driver.getContext());
		driver.findElementByClassName("android.widget.EditText").sendKeys("http://google.com");
		driver.findElementByXPath("//android.widget.Button[@resource-id='com.piti.webviewtester:id/websubmit']")
				.click();
		Set<String> s = driver.getContextHandles();

		for (String handle : s) {
			System.out.println(handle);
		}

		driver.context("WEBVIEW_com.google.android.gms");
		driver.findElement(By.name("q")).sendKeys("Handling hybrid app");

		// TEST STARTED: Verify end to end login
		// -------------------------------------------------------------------(end-to-end-verification-of-login;verify-end-to-end-login)
		// Jan 27, 2018 10:27:23 PM org.openqa.selenium.remote.ProtocolHandshake
		// createSession
		// INFO: Detected dialect: OSS
		// NATIVE_APP
		// WEBVIEW_com.piti.webviewtester
		// WEBVIEW_com.google.android.gms

	}

	public void gaana_app() {
		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='SKIP']").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@resource-id='com.gaana:id/action_radio']").click();

		// driver.findElementByAndroidUIAutomator(
		// "new UiScrollable(new
		// UiSelector()).scrollIntoView(resourceId(\"com.gaana:id/header.text\"));");
		//

		// toggle on
		driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.gaana:id/menu_icon']").click();
		Point point = driver
				.findElementByXPath("//android.widget.Switch[@resource-id='com.gaana:id/menuSwitchTheme_switch']")
				.getLocation();
		TouchAction t = new TouchAction(driver);
		t.tap(point.x + 20, point.y + 30).perform();

		// toggle off
		driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.gaana:id/menu_icon']").click();
		t.tap(point.x + 100, point.y + 30).perform();

	}
}
