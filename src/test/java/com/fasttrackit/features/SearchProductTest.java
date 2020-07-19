package com.fasttrackit.features;

import com.fasttrackit.steps.SearchProductSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchProductTest {

    @Managed(uniqueSession = true)
    private WebDriver driver;

    @Steps
    private SearchProductSteps searchProductSteps;

    @Test
    public void searchForProductTest(){
        searchProductSteps.searchForProduct();
        searchProductSteps.verifyTitleProduct();

    }

    @Test
    public void searchPriceBigger(){
        searchProductSteps.searchForProduct();
        searchProductSteps.verifyLastIsBigger();
    }
}
