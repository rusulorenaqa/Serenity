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

    @FindBy(css="ul li.method-checkout-cart-methods-onepage-bottom button")
    private WebElementFacade proceedCheckoutButton;

    @FindBy(css="tbody tr:first-child .a-right span.price ")
    private WebElementFacade subtotalPrices;


    public boolean isOnCartPage(){
        System.out.println(succesMessage.getText());
        return succesMessage.isDisplayed();
    }
    public void clickEmptyCartButton(){
        clickOn(emptyCartButton);
    }
    public void clickProceedCheckoutButton(){
        clickOn(proceedCheckoutButton);
    }
    public int getSubtotal(){
        String sum = subtotalPrices.getText();
        String sumWithoutCurrency = sum.replace(",00 RON", "");
        return Integer.valueOf(sumWithoutCurrency);
    }


}
