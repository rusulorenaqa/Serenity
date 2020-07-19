package com.fasttrackit.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@DefaultUrl("http://testfasttrackit.info/selenium-test/")
public class SearchProductPage extends PageObject {

    @FindBy(id="search")
    private WebElementFacade searchField;

    @FindBy(css=".input-box button[type='submit']")
    private WebElementFacade searchButton;

    @FindBy(css="li.item")
    private List<WebElementFacade> productsList;

    @FindBy(css="select[title='Sort By']")
    private WebElementFacade sortDropDown;

    public void fillSearch(){
        typeInto(searchField, "necklace");
    }
    public void clickSearch(){
        clickOn(searchButton);
    }

    public List<String> titleProducts(){
        List firstList = new ArrayList<String>();
        for(int i=0; i<productsList.size(); i++){
           firstList.add(productsList.get(i).find(By.cssSelector(".product-name a")).getText());}
        return firstList;
    }

    public boolean checkIfProductIsdisplayed(){
        return titleProducts().contains("SILVER DESERT NECKLACE");
    }

    public void sortByPrice(){
        sortDropDown.selectByVisibleText("Price");

    }

    public boolean priceProducts(){
        String primulPretText=productsList.get(0).find(By.cssSelector("span.price")).getText();
        String lastPriceText=productsList.get(productsList.size()-1).find(By.cssSelector("span.price")).getText();
        String firstPriceWithoutCurrency = primulPretText.replace(",00 RON","");
        String lastPriceWithoutCurrency = lastPriceText.replace(",00 RON","");
        Integer firstPrice = Integer.valueOf(firstPriceWithoutCurrency);
        Integer lastPrice = Integer.valueOf(lastPriceWithoutCurrency);
        return firstPrice < lastPrice;
    }
}
