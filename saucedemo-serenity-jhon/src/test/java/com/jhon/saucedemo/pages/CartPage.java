package com.jhon.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class CartPage extends PageObject {

    @FindBy(id = "checkout")
    WebElement checkoutBtn;

    public void checkout() {
        checkoutBtn.click();
    }
}
