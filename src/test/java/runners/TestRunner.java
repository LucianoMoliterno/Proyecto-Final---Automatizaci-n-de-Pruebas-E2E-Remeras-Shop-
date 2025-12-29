package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Ruta donde están tus archivos .feature
        features = "src/test/resources/features",
        // Nombre del paquete donde pusiste tus pasos (CompraSteps.java)
        glue = "steps",
        // Opcional: Genera un reporte HTML lindo en la carpeta target
        plugin = { "pretty", "html:target/cucumber-report.html" }
)
public class TestRunner {
    // Esta clase queda vacía, solo sirve para configurar la ejecución
}