package com.jhon.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class CheckoutPage extends PageObject {

    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement postalCodeInput;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "finish")
    WebElement finishBtn;

    public void fillForm(String first, String last, String zip) {
        // Espera explícitamente a que el primer campo sea visible
        waitFor(firstNameInput).withTimeoutOf(Duration.ofSeconds(10)).waitUntilVisible();

        firstNameInput.sendKeys(first);
        lastNameInput.sendKeys(last);
        postalCodeInput.sendKeys(zip);
        continueBtn.click();
    }

    public void finishCheckout() {
        finishBtn.click();
    }
}