package modelo;

public class Circulo extends FiguraCircular {

    public Circulo() {
        super();
    }

    public Circulo(Float radio) {
        super(radio);
    }

    @Override
    public Float calcularArea() {
        Float area = (float) (Math.PI * Math.pow(getRadio(), 2));
        setArea(area);
        return area;
    }

    @Override
    public Float calcularPerimetro() {
        return (float) (2 * Math.PI * getRadio());
    }

    @Override
    public Float calcularHipotenusa() {
        // No aplica para círculo, devolvemos 0 o null según tu preferencia
        return 0f;
    }
}