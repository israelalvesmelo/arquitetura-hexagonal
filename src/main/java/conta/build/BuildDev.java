package conta.build;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Responsável por configurar os serviços do spring
@Configuration
@ComponentScan({
        // objetos de sistema
        "conta.sistema",
        // adptadores falsos
        "conta.adaptador.dev"})
public class BuildDev {
    // Build 1: Adaptador Testes -> Sistema <- Adptadores Mocks
}
