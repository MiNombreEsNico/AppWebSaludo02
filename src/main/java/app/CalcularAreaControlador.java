package app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import modelo.Rectangulo;
import modelo.TrianguloRectangulo;
import modelo.Circulo;

@RestController
public class CalcularAreaControlador {
        
    public CalcularAreaControlador() {
        // Constructor por defecto
    }
    private Rectangulo rectangulo = null;
    private TrianguloRectangulo triangulo = null;
    private Circulo circulo = null;
    
    @GetMapping("/area")
    public String area(@RequestParam(value = "altura", defaultValue = "5") String altura,
                       @RequestParam(value = "base", defaultValue = "10") String base,
                       @RequestParam(value = "radio", required = false) String radio) {
        
        Float alturaFigura = Float.parseFloat(altura);
        Float baseFigura = Float.parseFloat(base);
        
        rectangulo = new Rectangulo();
        rectangulo.setAltura(alturaFigura);
        rectangulo.setBase(baseFigura);
        Float areaRectangulo = rectangulo.calcularArea();
        Float perimetroRectangulo = rectangulo.calcularPerimetro();
        Float hipotenusaRectangulo = rectangulo.calcularHipotenusa();
        
        triangulo = new TrianguloRectangulo();
        triangulo.setAltura(alturaFigura);
        triangulo.setBase(baseFigura);
        Float areaTriangulo = triangulo.calcularArea();
        Float perimetroTriangulo = triangulo.calcularPerimetro();
        Float hipotenusaTriangulo = triangulo.calcularHipotenusa();

        String resultadoCirculo = "";
        if (radio != null && !radio.isEmpty()) {
            try {
                Float radioFigura = Float.parseFloat(radio);
                circulo = new Circulo(radioFigura);
                Float areaCirculo = circulo.calcularArea();
                Float perimetroCirculo = circulo.calcularPerimetro();
                Float hipotenusaCirculo = circulo.calcularHipotenusa();
                resultadoCirculo =
                    "<li><b>Área círculo:</b> " + areaCirculo + "</li>" +
                    "<li><b>Perímetro círculo:</b> " + perimetroCirculo + "</li>" +
                    "<li><b>Hipotenusa círculo:</b> " + hipotenusaCirculo + " (no aplica)</li>";
            } catch (NumberFormatException e) {
                resultadoCirculo = "<li><b>Datos de círculo inválidos</b></li>";
            }
        }

        return "<div class='md-card-content'>" +
               "<span class='md-title'>Resultados</span>" +
               "<ul class='md-list'>" +
               "<li><b>Área rectángulo:</b> " + areaRectangulo + "</li>" +
               "<li><b>Perímetro rectángulo:</b> " + perimetroRectangulo + "</li>" +
               "<li><b>Hipotenusa rectángulo:</b> " + hipotenusaRectangulo + "</li>" +
               "<li><b>Área triángulo rectángulo:</b> " + areaTriangulo + "</li>" +
               "<li><b>Perímetro triángulo rectángulo:</b> " + perimetroTriangulo + "</li>" +
               "<li><b>Hipotenusa triángulo rectángulo:</b> " + hipotenusaTriangulo + "</li>" +
               resultadoCirculo +
               "</ul>" +
               "</div>";
    }
}
