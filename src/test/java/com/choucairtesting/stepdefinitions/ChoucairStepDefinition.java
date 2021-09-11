package com.choucairtesting.stepdefinitions;

import com.choucairtesting.steps.HomeStep;
import com.choucairtesting.steps.JobPortalStep;
import com.choucairtesting.models.Data;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ChoucairStepDefinition {
    @Steps
    HomeStep homeStep;
    @Steps
    JobPortalStep jobPortalStep;

    @Given("^enter the Choucair page$")
    public void enterTheChoucairPage() {
        homeStep.openBrowser();

    }

    @When("^I enter the jobs module$")
    public void iEnterTheJobsModule() {
        homeStep.enterJobs();
    }

    @Then("^go to the job portal$")
    public void goToTheJobPortal(List<Data> dataList) {
        jobPortalStep.portalJob(dataList.get(0));
    }
}
