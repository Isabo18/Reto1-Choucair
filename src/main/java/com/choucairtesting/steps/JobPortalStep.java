package com.choucairtesting.steps;

import com.choucairtesting.models.Data;
import com.choucairtesting.pageobjects.JobPortalPage;
import javafx.application.Application;
import javafx.stage.Stage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class JobPortalStep  {

    JobPortalPage jobPortalPage = new JobPortalPage();
    @Step
    public void portalJob(Data data){
        jobPortalPage.clickButtonJobPortal();
        jobPortalPage.clickButtonContinuar();
        jobPortalPage.validateMessage.equals(data.getMessage());
    }
}
