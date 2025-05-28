package TestCucumber;

import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Clases.Factura;
import TestCucumber.FacturaService;

public class FacturaSteps {
    private String servicio;
    private double total;
    private String fecha;
    private Factura resultado;
    private FacturaService service = new FacturaService(f -> new Factura(1, f.getFecha(), f.getServicio(), f.getTotal())); // stub simple

    @Given("un servicio llamado {string}")
    public void un_servicio_llamado(String nombreServicio) {
        this.servicio = nombreServicio;
    }

    @And("un total de {double}")
    public void un_total_de(Double total) {
        this.total = total;
    }

    @And("una fecha {string}")
    public void una_fecha(String fecha) {
        this.fecha = fecha;
    }

    @When("se genera la factura")
    public void se_genera_la_factura() {
        resultado = service.generarFactura(fecha, servicio, total);
    }

    @Then("la factura debe contener el servicio {string}")
    public void la_factura_debe_contener_servicio(String esperado) {
        assertEquals(esperado, resultado.getServicio());
    }

    @And("el total debe ser {double}")
    public void el_total_debe_ser(double esperado) {
        assertEquals(esperado, resultado.getTotal());
    }
}
