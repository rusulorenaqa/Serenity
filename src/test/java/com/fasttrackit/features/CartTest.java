package com.fasttrackit.features;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductBedPage;
import com.fasttrackit.steps.CartSteps;
import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;

    @Steps
    private CartSteps cartSteps;


    @Test
    public void addToCartTest(){
        loginSteps.login("rusulorena@yahoo.com","123456");
        cartSteps.navigateToBedBath();
        cartSteps.addToCartFirstProduct();
        cartSteps.succesAddCartFirstProduct();
        cartSteps.emptyCart();
    }

    @Test

    public void compareSum(){
       cartSteps.openHomeNavigateToBedBath();
       Integer sumPrices = cartSteps.sumPrices();
       cartSteps.addToCartThreeProducts();
       Integer subtotal = cartSteps.subtotal();
       Assert.assertEquals(sumPrices,subtotal);
    }






}




