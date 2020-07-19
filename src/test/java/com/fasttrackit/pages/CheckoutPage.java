package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.time.Duration;

@DefaultUrl("http://testfasttrackit.info/selenium-test/checkout/onepage/")

public class CheckoutPage extends PageObject {

    @FindBy(css=".buttons-set button[onclick='billing.save()']")
    private WebElementFacade billContinueButton;

    @FindBy(css=".buttons-set button[onclick='shippingMethod.save()']")
    private WebElementFacade shipContinueButton;

    @FindBy(css=".buttons-set button[onclick='payment.save()']")
    private WebElementFacade paymentContinueButton;

    @FindBy(css=".buttons-set button[onclick='review.save();']")
    private WebElementFacade placeOrderButton;

    public void clickBillContinueButton(){
        clickOn(billContinueButton);
    }
    public void clickShipContinueButton(){
        withTimeoutOf(Duration.ofSeconds(5)).waitFor(shipContinueButton);

        clickOn(shipContinueButton);
    }
    public void clickPaymentContinueButton(){
        clickOn(paymentContinueButton);
    }
    public void clickPlaceOrderButton(){
        clickOn(placeOrderButton);
    }



}
