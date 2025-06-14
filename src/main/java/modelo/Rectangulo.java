package modelo;

public class Rectangulo extends Figuras {

    public Rectangulo() {
        // Constructor por defecto
    }

    public Rectangulo(Float base, Float altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    @Override
    public Float calcularArea() {
        return this.getAltura() * this.getBase();
    }

    @Override
    public Float calcularPerimetro() {
        return 2 * (this.getAltura() + this.getBase());
    }

    @Override
    public Float calcularHipotenusa() {
        // La diagonal del rectángulo es la hipotenusa
        return (float) Math.sqrt(Math.pow(this.getAltura(), 2) + Math.pow(this.getBase(), 2));
    }
}