package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoControlador {

    @GetMapping("/holamundo")
    public String holamundo(@RequestParam(value = "nombre", defaultValue = "Mundo") String nombre) {
        return "<div class='md-card-content'>" +
               "<span class='md-title'>¡Hola, " + nombre + "!</span>" +
               "<p class='md-text'>¡Bienvenido/a a la aplicación de cálculo de áreas!</p>" +
               "</div>";
    }
}