package com.fasttrackit.features;

import com.fasttrackit.steps.RegisterSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Random;

@RunWith(SerenityRunner.class)
public class RegisterTest {

    @Managed(uniqueSession = false)
    private WebDriver driver;

    @Steps
    private RegisterSteps registerSteps;

    private String firstName ="Rusu";
    private String middleName = "Lorena";
    private String lastName="Florina";

    Random rand = new Random();
    private String email= "rusulorena"+ rand.nextInt()+"@yahoo.com";
    private String pass ="123456";
    private String confirmPass="123456";



    @Test

    public void validRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerAccount(firstName, middleName, lastName, email, pass, confirmPass);
        registerSteps.verifyRegister();
    }

    @Test

    public void invalidEmailRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerAccount(firstName, middleName, lastName, " ", pass, confirmPass);
        registerSteps.verifyNotRegister();
    }

    @Test

    public void confPassWrongRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerAccount(firstName, middleName, lastName, email, pass, "1234567");
        registerSteps.verifyNotRegister();
    }

    @Test

    public void emailExistingRegisterTest(){
        registerSteps.navigateToRegisterPage();
        registerSteps.registerAccount(firstName, middleName, lastName, "rusulorena@yahoo.com", pass, confirmPass);
        registerSteps.verifyNotRegister();
    }

}
