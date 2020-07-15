package com.fasttrackit.steps;

import com.fasttrackit.pages.HomePage;
import com.fasttrackit.pages.LoginPage;
import com.fasttrackit.pages.MyDashboardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {

    private HomePage homePage;
    private LoginPage loginPage;
    private MyDashboardPage myDashboardPage;

    @Step
    public void navigateToLoginPage(){
        homePage.open();
        homePage.clickAccount();
        homePage.clickLogin();
    }

    @Step
    public void loginWithCredetials(String email, String pass){
        loginPage.setUserEmailField(email);
        loginPage.setUserPasswordField(pass);
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyLoggedIn(String userName){
        Assert.assertTrue(myDashboardPage.verifyLoginText(userName));
    }

    @Step
    public void login(String email, String pass){
        navigateToLoginPage();
        loginWithCredetials(email, pass);
    }

    @Step
    public void verifyNotLoggedIn(){
        Assert.assertTrue(loginPage.isOnLoginPage());
    }

}

