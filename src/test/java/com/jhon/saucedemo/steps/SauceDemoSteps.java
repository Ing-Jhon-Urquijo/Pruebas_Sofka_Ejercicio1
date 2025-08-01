package com.jhon.saucedemo.steps;

import com.jhon.saucedemo.pages.*;
import net.serenitybdd.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class SauceDemoSteps {

    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ConfirmationPage confirmationPage;

    @Step("El usuario ingresa a la página de SauceDemo")
    public void abrirPagina() {
        loginPage.open();
    }

    @Step("El usuario se autentica con usuario {0} y clave {1}")
    public void login(String user, String password) {
        loginPage.login(user, password);
    }

    @Step("Agrega dos productos al carrito")
    public void agregarProductos() {
        productsPage.addFirstTwoProducts();
    }

    @Step("Visualiza el carrito")
    public void visualizarCarrito() {
        productsPage.goToCart();
    }

    @Step("Procede al checkout")
    public void procederCheckout() {
        cartPage.checkout();
    }

    @Step("Completa el formulario de compra con los datos: {0}, {1}, {2}")
    public void completarFormulario(String firstName, String lastName, String zipCode) {
        checkoutPage.fillForm(firstName, lastName, zipCode);
    }

    @Step("Finaliza la compra")
    public void finalizarCompra() {
        checkoutPage.finishCheckout();
    }

    @Step("Verifica el mensaje de confirmación")
    public void verificarConfirmacion(String mensaje) {
        assertThat(confirmationPage.getConfirmationText()).isEqualToIgnoringCase(mensaje);
    }
}