package com.fasttrackit.steps;

import com.fasttrackit.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class CheckoutSteps {

    private CheckoutPage checkoutPage;

    @Step
    public void fillInfoAndPlaceOrder(){
        checkoutPage.clickBillContinueButton();
        checkoutPage.clickShipContinueButton();
        checkoutPage.clickPaymentContinueButton();
        checkoutPage.clickPlaceOrderButton();
    }


}
