package TestMockito;

import org.example.Clases.Factura;
import TestMockito.FacturaRepository;
import TestMockito.FacturaService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class FacturaServiceTest {
    @Test
    void testGenerarFactura() {
        // Simular el repositorio
        FacturaRepository mockRepo = mock(FacturaRepository.class);

        // Servicio que usa el repositorio simulado
        FacturaService service = new FacturaService(mockRepo);

        // Comportamiento simulado del repositorio
        Factura mockFactura = new Factura(1, "2025-05-08", "Cambio pastillas de freno", 89.99);
        when(mockRepo.guardar(any(Factura.class))).thenReturn(mockFactura);

        // Ejecutar la integración
        Factura resultado = service.generarFactura("2025-05-08", "Cambio pastillas de freno", 89.99);

        // Verificar el resultado
        assertEquals(1, resultado.getId());
        assertEquals("Cambio pastillas de freno", resultado.getServicio());
        assertEquals(89.99, resultado.getTotal());

        // Verificar que el método guardar fue llamado 1 vez
        verify(mockRepo, times(1)).guardar(any(Factura.class));
    }
}
