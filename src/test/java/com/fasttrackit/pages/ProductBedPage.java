package com.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.interactions.Actions;

@DefaultUrl("http://testfasttrackit.info/selenium-test/home-decor/bed-bath.html")
public class ProductBedPage extends PageObject {


    @FindBy(css="ul.products-grid li:first-child div.actions button[title='Add to Cart']")
    private WebElementFacade addToCartFirstProduct;

    public void clickAddCartFirstProduct(){clickOn(addToCartFirstProduct);}
    }



