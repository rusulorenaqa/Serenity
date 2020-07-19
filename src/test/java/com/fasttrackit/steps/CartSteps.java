package com.fasttrackit.steps;

import com.fasttrackit.pages.CartPage;
import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.ProductBedPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;


public class CartSteps {

    private HomePage homePage;
    private ProductBedPage productBedPage;
    private CartPage cartPage;

    @Step

    public void navigateToBedBath (){
        homePage.hoverOverHomeDecor();
        homePage.clickBedBath();
    }
    @Step

    public void addToCartFirstProduct(){
        productBedPage.clickAddCartFirstProduct();
    }

    @Step

    public void succesAddCartFirstProduct() {
        Assert.assertTrue(cartPage.isOnCartPage());
    }

    @Step
    public void emptyCart() {
        cartPage.clickEmptyCartButton();
    }

    @Step
    public void proceedToCheckout() {
        cartPage.clickProceedCheckoutButton();
    }

    @Step
    public int sumPrices() {
        homePage.hoverOverHomeDecor();
        homePage.clickBedBath();
        return productBedPage.getPriceFirstProduct() + productBedPage.getPriceSecondProduct() + productBedPage.getPriceThirdProduct();
    }


    @Step
    public void openHomeNavigateToBedBath() {
        homePage.open();
        homePage.hoverOverHomeDecor();
        homePage.clickBedBath();
    }

    @Step
    public void addToCartThreeProducts() {

        productBedPage.clickAddCartFirstProduct();
        homePage.hoverOverHomeDecor();
        homePage.clickBedBath();
        productBedPage.clickAddCartSecondProduct();
        homePage.hoverOverHomeDecor();
        homePage.clickBedBath();
        productBedPage.clickAddCartThirdProduct();
    }

    @Step
    public int subtotal() {
        return cartPage.getSubtotal();
    }
}

