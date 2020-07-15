package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.MyDashboardPage;
import com.fasttrackit.pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps {


    private HomePage homePage;
    private RegisterPage registerPage;
    private MyDashboardPage myDashboardPage;

    @Step
    public void navigateToRegisterPage(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickRegister();
    }

    @Step
    public void registerAccount(String firstName, String middleName, String lastName, String email, String pass, String confirmPass){
        registerPage.setFirstNameField(firstName);
        registerPage.setMiddleNameField(middleName);
        registerPage.setLastNameField(lastName);
        registerPage.setEmailField(email);
        registerPage.setPasswordField(pass);
        registerPage.setConfirmPassField(confirmPass);
        registerPage.clickRegisterButton();
    }

    @Step

    public void verifyNotRegister(){
        Assert.assertTrue(registerPage.isOnRegisterPage());
    }

    @Step

    public void verifyRegister(){
        Assert.assertTrue(myDashboardPage.verifyRegisterText());
    }

}
