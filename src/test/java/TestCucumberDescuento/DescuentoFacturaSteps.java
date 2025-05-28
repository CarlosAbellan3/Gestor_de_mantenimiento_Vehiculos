package TestCucumberDescuento;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Clases.Factura;

public class DescuentoFacturaSteps {
    private Factura factura;

    @Given("una factura con total {double}")
    public void una_factura_con_total(double total) {
        factura = new Factura(1, "2025-05-10", "Servicio completo", total);
    }

    @When("se aplica un descuento del {double}%")
    public void se_aplica_un_descuento(double porcentaje) {
        factura.aplicarDescuento(porcentaje); // 🔴 este método aún no existe
    }

    @Then("el total con descuento debe ser {double}")
    public void el_total_con_descuento_debe_ser(double esperado) {
        assertEquals(esperado, factura.getTotal(), 0.01);
    }
}
