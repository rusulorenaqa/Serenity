package com.fasttrackit.features;


import com.fasttrackit.steps.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed(uniqueSession = false)
    private WebDriver driver;

    @Steps
    private LoginSteps loginSteps;


    private String user = "rusulorena@yahoo.com";
    private String pass = "123456";

    @Test
    public void validLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,pass);
        loginSteps.verifyLoggedIn("LORENA RUSU");
    }

    @Test
    public void invalidUseremailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("abcd",pass);
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void invalidPassLoginTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,"9876");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyPasswrodTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials(user,"");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("","123123");
        loginSteps.verifyNotLoggedIn();
    }

    @Test
    public void emptyUserEmailAndPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredetials("","");
        loginSteps.verifyNotLoggedIn();
    }


}
