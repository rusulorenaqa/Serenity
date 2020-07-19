package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.SearchProductPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchProductSteps {

    private SearchProductPage searchProductPage;
    private HomePage homePage;

    @Step
    public void searchForProduct(){
        homePage.open();
        searchProductPage.fillSearch();
        searchProductPage.clickSearch();
    }

    @Step
    public void verifyTitleProduct(){
        Assert.assertTrue(searchProductPage.checkIfProductIsdisplayed());
    }

    @Step

    public void verifyLastIsBigger(){
        searchProductPage.sortByPrice();
        Assert.assertTrue(searchProductPage.priceProducts());
    }



}
