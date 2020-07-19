package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/success/")
public class SuccessPage extends PageObject {

@FindBy(css=".page-title h1")
    private WebElementFacade successTextField;

public boolean verifySuccessfullOrder(){
    return successTextField.isDisplayed();

}

}
