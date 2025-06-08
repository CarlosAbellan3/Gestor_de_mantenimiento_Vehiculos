package org.example.Clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FacturaTest {

    @Test
    void getId() {
        // Arrange: crear una factura con ID específico
        Factura factura = new Factura(5, "2025-06-07", "Cambio de aceite", 99.99);

        // Act: obtener el ID
        int id = factura.getId();

        // Assert: verificar que el ID es correcto
        assertEquals(5, id);
    }

    @Test
    void setId() {
    }

    @Test
    void getFecha() {
    }

    @Test
    void setFecha() {
    }

    @Test
    void getServicio() {
    }

    @Test
    void setServicio() {
    }

    @Test
    void getTotal() {
    }

    @Test
    void setTotal() {
    }

    @Test
    void aplicarDescuento() {
    }
}