package com.fasttrackit.pages;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://testfasttrackit.info/selenium-test/customer/account/create/")
public class RegisterPage extends PageObject {

    @FindBy(id="firstname")

    private WebElementFacade firstNameField;

    @FindBy(id="middlename")

    private WebElementFacade middleNameField;

    @FindBy(id="lastname")

    private WebElementFacade lastNameField;

    @FindBy(id="email_address")

    private WebElementFacade emailField;

    @FindBy(id="password")

    private WebElementFacade passwordField;

    @FindBy(id="confirmation")

    private WebElementFacade confirmPassField;

    @FindBy(css="button[title='Register']")

    private WebElementFacade registerButton;


    public void setFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setMiddleNameField(String middleName){
        typeInto(middleNameField, middleName);
    }
    public void setLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }
    public void setEmailField(String email){
        typeInto(emailField, email);
    }
    public void setPasswordField(String pass){
        typeInto(passwordField, pass);
    }
    public void setConfirmPassField(String confPass){typeInto(confirmPassField, confPass);}
    public void clickRegisterButton() {clickOn(registerButton);}
    public boolean isOnRegisterPage(){ return firstNameField.isDisplayed();}

}
