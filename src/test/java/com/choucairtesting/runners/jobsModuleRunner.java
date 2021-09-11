package com.choucairtesting.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/magnetJobs.feature",
                glue = "com.choucairtesting.stepdefinitions",
                snippets = SnippetType.CAMELCASE)
public class jobsModuleRunner {
}
