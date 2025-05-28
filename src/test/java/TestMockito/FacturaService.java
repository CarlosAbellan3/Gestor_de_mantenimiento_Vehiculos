package TestMockito;

import org.example.Clases.Factura;
import TestMockito.FacturaRepository;

public class FacturaService {
    private final FacturaRepository repository;

    public FacturaService(FacturaRepository repository) {
        this.repository = repository;
    }
    public Factura generarFactura(String fecha, String servicio, double total) {
        Factura nueva = new Factura(0, fecha, servicio, total);
        return repository.guardar(nueva);
    }
}