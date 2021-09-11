package com.choucairtesting.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.choucairtesting.com/")
public class HomePage extends PageObject {

    By buttonJobs = By.id("menu-item-550");
    By buttonCookies = By.id("cookie_action_close_header");


    public void clickButtonJobs(){getDriver().findElement(buttonJobs).click();}
    public void clickButtonCookies(){getDriver().findElement(buttonCookies).click();}
}
