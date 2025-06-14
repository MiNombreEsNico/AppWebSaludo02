package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import modelo.Rectangulo;
import modelo.TrianguloRectangulo;

@RestController
public class CalcularAreaControlador {
        
    public CalcularAreaControlador() {
        // Constructor por defecto
    }
    private Rectangulo rectangulo = null;
    private TrianguloRectangulo triangulo = null;
    
    @GetMapping("/area")
    public String area(@RequestParam(value = "altura", defaultValue = "5") String altura,
                       @RequestParam(value = "base", defaultValue = "10") String base) {
        
        Float alturaFigura = Float.parseFloat(altura);
        Float baseFigura = Float.parseFloat(base);
        
        rectangulo = new Rectangulo();
        rectangulo.setAltura(alturaFigura);
        rectangulo.setBase(baseFigura);
        Float areaRectangulo = rectangulo.calcularArea();
        
        triangulo = new TrianguloRectangulo();
        triangulo.setAltura(alturaFigura);
        triangulo.setBase(baseFigura);
        Float areaTriangulo = triangulo.calcularArea();
        
        return "<div class='md-card-content'>" +
               "<span class='md-title'>Resultados</span>" +
               "<ul class='md-list'>" +
               "<li><b>Área rectángulo:</b> " + areaRectangulo + "</li>" +
               "<li><b>Área triángulo rectángulo:</b> " + areaTriangulo + "</li>" +
               "</ul>" +
               "</div>";
    }
}