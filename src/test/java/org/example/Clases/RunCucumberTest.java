package org.example.Clases;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Ruta a los archivos .feature
        glue = "gestor",                            // Paquete que contiene tus step definitions
        plugin = {"pretty", "html:target/cucumber-report.html"}, // Genera reporte HTML
        monochrome = true
)
public class RunCucumberTest {
}
