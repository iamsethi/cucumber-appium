package com.cucumber.appium.page;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class APIDemoAppPageObject extends PageObject {

	AndroidDriver<AndroidElement> driver;

	@FindBy(xpath = "//android.widget.TextView[@text='Views']")
	public WebElement views;

	@FindBy(xpath = "//android.widget.TextView[@text='Expandable Lists']")
	public WebElement expandable_lists;

	@FindBy(xpath = "//android.widget.TextView[@text='1. Custom Adapter']")
	public WebElement custom_adapter;

	@FindBy(xpath = "//android.widget.TextView[@text='People Names']")
	public WebElement people_names;

	@FindBy(id = "android:id/alertTitle")
	public WebElement alert_title;

	@FindBy(xpath = "//android.widget.TextView[@text='Drag and Drop']")
	public WebElement drag_and_drop;

	@FindBy(xpath = "//android.widget.TextView[@text='Preference']")
	public WebElement preference;

	@FindBy(xpath = "//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement preference_dependency;

	@FindBy(id = "android:id/checkbox")
	public WebElement checkbox;

	@FindBy(xpath = "//android.widget.RelativeLayout)[2]")
	public WebElement relative_layout;

	@FindBy(className = "android.widget.EditText")
	public WebElement edit_text;

	@FindBy(androidUIAutomator = "text(\"Views\")")
	public WebElement text_views_ui_automator;

	@FindBy(androidUIAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")
	public WebElement webview_ui_automator;

	@FindBy(xpath = "//android.widget.TextView[@text='Date Widgets']")
	public WebElement date_widgets;

	@FindBy(androidUIAutomator = "text(\"2. Inline\")")
	public WebElement txt_inline_ui_automator;

	@FindBy(xpath = "//*[@content-desc='6']")
	public WebElement content_desc;

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement language_english;

}
