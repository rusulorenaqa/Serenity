package com.fasttrackit.steps;

import com.fasttrackit.pages.SuccessPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SuccessSteps {

    private SuccessPage successPage;

    @Step
    public void verifySuccessPlaceOrder(){
        Assert.assertTrue(successPage.verifySuccessfullOrder());
    }
}
