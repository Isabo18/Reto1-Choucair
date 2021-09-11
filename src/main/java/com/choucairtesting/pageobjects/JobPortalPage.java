package com.choucairtesting.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class JobPortalPage extends PageObject {
    By buttonJobPortal = By.xpath("//span[contains(text(), 'Ir al portal de empleos')]");
    By buttonContinuar = By.xpath("//span[contains(text (),'Continuar')]");
    public By validateMessage = By.xpath("//h2[contains(text(),'En Choucair sabemos como llegar a la meta')]");

    public void clickButtonJobPortal(){getDriver().findElement(buttonJobPortal).click();}
    public void clickButtonContinuar(){getDriver().findElement(buttonContinuar).click();}
    public void setValidateMessage(){getDriver().findElement(validateMessage).getText();}

}
