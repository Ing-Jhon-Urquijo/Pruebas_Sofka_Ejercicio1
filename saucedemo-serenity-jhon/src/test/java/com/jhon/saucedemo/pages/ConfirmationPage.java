package com.jhon.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class ConfirmationPage extends PageObject {

    @FindBy(className = "complete-header")
    WebElement confirmationText;

    public String getConfirmationText() {
        return confirmationText.getText();
    }
}
