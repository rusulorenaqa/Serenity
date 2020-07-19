package com.fasttrackit.features;

import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.CheckoutSteps;
import com.fasttrackit.steps.LoginSteps;
import com.fasttrackit.steps.SuccessSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CheckoutTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;

    @Steps
    private CheckoutSteps checkoutSteps;

    @Steps
    private SuccessSteps successSteps;

    @Test

    public void successfullCheckoutTest(){
        loginSteps.login("rusulorena@yahoo.com", "123456");
        cartSteps.navigateToBedBath();
        cartSteps.addToCartFirstProduct();
        cartSteps.succesAddCartFirstProduct();
        cartSteps.proceedToCheckout();
        checkoutSteps.fillInfoAndPlaceOrder();
        successSteps.verifySuccessPlaceOrder();
    }

}
