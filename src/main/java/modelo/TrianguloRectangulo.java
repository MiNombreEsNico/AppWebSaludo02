package modelo;

public class TrianguloRectangulo extends Figuras  {

    public TrianguloRectangulo() {
        // Constructor por defecto
    }

    public TrianguloRectangulo(Float base, Float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    @Override
    public Float calcularArea() {
        return (this.getAltura() * this.getBase()) / 2;
    }

    @Override
    public Float calcularPerimetro() {
        // Suma de los tres lados: base, altura e hipotenusa
        return this.getBase() + this.getAltura() + calcularHipotenusa();
    }

    @Override
    public Float calcularHipotenusa() {
        // Pitágoras
        return (float) Math.sqrt(Math.pow(this.getBase(), 2) + Math.pow(this.getAltura(), 2));
    }
}