import org.example.Clases.Factura;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FacturaTest {
    private Factura factura;

    @BeforeEach
    public void setUp() {
        // Inicializa una Factura antes de cada test
        factura = new Factura(1, "2024-05-08", "Consultoría", 1500.00);
    }

    @Test
    public void testGetId() {
        assertEquals(1, factura.getId());
    }

    @Test
    public void testSetId() {
        factura.setId(10);
        assertEquals(10, factura.getId());
    }

    @Test
    public void testGetFecha() {
        assertEquals("2024-05-08", factura.getFecha());
    }

    @Test
    public void testSetFecha() {
        factura.setFecha("2024-05-09");
        assertEquals("2024-05-09", factura.getFecha());
    }

    @Test
    public void testGetServicio() {
        assertEquals("Consultoría", factura.getServicio());
    }

    @Test
    public void testSetServicio() {
        factura.setServicio("Desarrollo Web");
        assertEquals("Desarrollo Web", factura.getServicio());
    }

    @Test
    public void testGetTotal() {
        assertEquals(1500.00, factura.getTotal(), 0.001); // Usamos delta para comparar doubles
    }

    @Test
    public void testSetTotal() {
        factura.setTotal(2000.00);
        assertEquals(2000.00, factura.getTotal(), 0.001); // Usamos delta para comparar doubles
    }
}

