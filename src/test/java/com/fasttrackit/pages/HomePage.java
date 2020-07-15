package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class
HomePage extends PageObject {

    @FindBy(css = ".skip-account .label")
    private WebElementFacade accountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade loginLink;

    @FindBy(css = "a[title='Register']")
    private WebElementFacade registerLink;

    @FindBy(css= ".slideshow-container")
    private WebElementFacade slideshowContainer;

    @FindBy(className= "nav-4")
    private WebElementFacade linkHomeDecor;

    @FindBy(className = "nav-4-2")
    private WebElementFacade linkBedBath;

    public void clickAccount(){
        clickOn(accountLink);
    }

    public void clickLogin(){
        clickOn(loginLink);
    }

    public void clickRegister(){ clickOn(registerLink);}

    public void hoverOver(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(loginLink).perform();

    }
    public boolean isOnHomePage(){ return slideshowContainer.isDisplayed(); }

    public void hoverOverHomeDecor(){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(linkHomeDecor).perform();
    }
    public void clickBedBath(){
        clickOn(linkBedBath);
    }



}
