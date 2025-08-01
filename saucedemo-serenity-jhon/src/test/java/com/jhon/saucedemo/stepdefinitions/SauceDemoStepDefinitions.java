package com.jhon.saucedemo.stepdefinitions;

import com.jhon.saucedemo.steps.SauceDemoSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class SauceDemoStepDefinitions {

    @Steps
    SauceDemoSteps steps;

    @Given("el usuario ingresa a la página de SauceDemo")
    public void queElUsuarioNavegaALaPaginaDeSauceDemo() {
        steps.abrirPagina();
    }

    @When("se autentica con usuario {string} y clave {string}")
    public void seAutenticaConUsuarioYClave(String user, String password) {
        steps.login(user, password);
    }

    @When("agrega dos productos al carrito")
    public void agregaDosProductosAlCarrito() {
        steps.agregarProductos();
    }

    @When("visualiza el carrito")
    public void visualizaElCarrito() {
        steps.visualizarCarrito();
    }

    @When("procede al checkout")
    public void procedeAlCheckout() {
        steps.procederCheckout();
    }

    @When("completa el formulario con nombre {string}, apellido {string} y codigo postal {string}")
    public void completaElFormularioCon(String firstName, String lastName, String zipCode) {
        steps.completarFormulario(firstName, lastName, zipCode);
    }

    // Este método maneja el paso "And completa el formulario de compra"
    // No acepta argumentos porque tu archivo .feature no se los está pasando.
    // Esto podría causar un error en tu test si el paso del .feature es diferente.
    // El .feature que mostraste no tiene argumentos en este paso.
    @When("completa el formulario de compra")
    public void completaElFormularioDeCompraSinArgumentos() {
        // En este caso, como no hay argumentos, el test podría fallar.
        // Lo mejor es que tu feature file sea más específico como el paso de arriba.
        // Por ahora, para que compile, lo dejamos así.
        steps.completarFormulario("Jhon", "Urquijo", "12345");
    }

    @When("finaliza la compra")
    public void finalizaLaCompra() {
        steps.finalizarCompra();
    }

    @Then("debería ver el mensaje de confirmación {string}")
    public void deberiaVerElMensajeDeConfirmacion(String mensaje) {
        steps.verificarConfirmacion(mensaje);
    }
}