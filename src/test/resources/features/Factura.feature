Feature: Obtener ID de una factura

  Scenario: Consultar el ID de una factura
    Given una factura con ID 7
    When consulto el ID de la factura
    Then el ID devuelto debe ser 7