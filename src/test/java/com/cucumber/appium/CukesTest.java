package com.cucumber.appium;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features", tags = { "~@Parameterization" }, glue = {
		"net.cucumber.serenity" })
public class CukesTest {

}
