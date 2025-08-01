package com.jhon.saucedemo.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductsPage extends PageObject {

    @FindBy(className = "btn_inventory")
    List<WebElement> addButtons;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    public void addFirstTwoProducts() {
        addButtons.get(0).click();
        addButtons.get(1).click();
    }

    public void goToCart() {
        cartIcon.click();
    }
}
