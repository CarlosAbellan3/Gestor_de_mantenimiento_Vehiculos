package steps;

import org.example.Clases.Factura;
import io.cucumber.java.en.*;
import static org.junit.jupiter.api.Assertions.*;

public class FacturaSteps {

    private Factura factura;
    private int resultadoId;

    @Given("una factura con ID {int}")
    public void una_factura_con_id(Integer id) {
        factura = new Factura(id, "2025-06-07", "Cambio aceite", 100.0);
    }

    @When("consulto el ID de la factura")
    public void consulto_el_id_de_la_factura() {
        resultadoId = factura.getId();
    }

    @Then("el ID devuelto debe ser {int}")
    public void el_id_devuelto_debe_ser(Integer esperado) {
        assertEquals(esperado, resultadoId);
    }
}