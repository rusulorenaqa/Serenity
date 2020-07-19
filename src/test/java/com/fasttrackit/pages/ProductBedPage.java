package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://testfasttrackit.info/selenium-test/home-decor/bed-bath.html")
public class ProductBedPage extends PageObject {


    @FindBy(css = "ul.products-grid li:first-child div.actions button[title='Add to Cart']")
    private WebElementFacade addToCartFirstProduct;

    @FindBy(css = "li:first-child div.price-box .regular-price span")
    private WebElementFacade priceFirstProduct;

    @FindBy(css = "li:nth-child(2) div.actions button[title='Add to Cart']")
    private WebElementFacade addToCartSecondProduct;

    @FindBy(css = "li:nth-child(2) div.price-box .regular-price span")
    private WebElementFacade priceSecondProduct;

    @FindBy(css = "li:nth-child(3) div.actions button[title='Add to Cart']")
    private WebElementFacade addToCartThirdProduct;

    @FindBy(css = "li:nth-child(3) div.price-box .regular-price span")
    private WebElementFacade priceThirdProduct;

    public void clickAddCartFirstProduct() {
        clickOn(addToCartFirstProduct);
    }
    public void clickAddCartSecondProduct() {
        clickOn(addToCartSecondProduct);
    }
    public void clickAddCartThirdProduct() {
        clickOn(addToCartThirdProduct);
    }
    public int getPriceFirstProduct(){
        String priceWithCurrency = priceFirstProduct.getText();
        String priceWithoutCurrency = priceWithCurrency.replace(",00 RON", "");
        return Integer.valueOf(priceWithoutCurrency);
    }
    public int getPriceSecondProduct(){
        String priceWithCurrency = priceSecondProduct.getText();
        String priceWithoutCurrency = priceWithCurrency.replace(",00 RON", "");
        return Integer.valueOf(priceWithoutCurrency);
    }
    public int getPriceThirdProduct(){
        String priceWithCurrency = priceThirdProduct.getText();
        String priceWithoutCurrency = priceWithCurrency.replace(",00 RON", "");
        return Integer.valueOf(priceWithoutCurrency);
    }



}









