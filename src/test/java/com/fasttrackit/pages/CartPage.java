package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/cart/")
public class CartPage extends PageObject {

    @FindBy(css=".success-msg span")
    private WebElementFacade succesMessage;

    @FindBy(id="empty_cart_button")
    private WebElementFacade emptyCartButton;

    public boolean isOnCartPage(){
        System.out.println(succesMessage.getText());
        return succesMessage.isDisplayed();
    }
    public void clickEmptyCartButton(){
        clickOn(emptyCartButton);
    }




}
