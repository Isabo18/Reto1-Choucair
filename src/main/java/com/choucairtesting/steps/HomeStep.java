package com.choucairtesting.steps;

import com.choucairtesting.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeStep {

    HomePage homePage = new HomePage();

    @Step
    public void openBrowser(){homePage.open();}
    @Step
    public void enterJobs(){
        homePage.clickButtonJobs();
        homePage.clickButtonCookies();

    }

}
