package TestCucumber;

import org.example.Clases.Factura;
import java.util.function.Function;

public class FacturaService {
    private final Function<Factura, Factura> saveFunction;

    public FacturaService(Function<Factura, Factura> saveFunction) {
        this.saveFunction = saveFunction;
    }

    public Factura generarFactura(String fecha, String servicio, double total) {
        Factura factura = new Factura(0, fecha, servicio, total);
        return saveFunction.apply(factura);
    }
}
