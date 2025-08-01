Feature: Flujo de compra en SauceDemo

  Scenario: Comprar dos productos exitosamente
    Given el usuario ingresa a la página de SauceDemo
    When se autentica con usuario "standard_user" y clave "secret_sauce"
    And agrega dos productos al carrito
    And visualiza el carrito
    And procede al checkout
    And completa el formulario con nombre "Jhon", apellido "Urquijo" y codigo postal "12345"
    And finaliza la compra
    Then debería ver el mensaje de confirmación "Thank you for your order!"
