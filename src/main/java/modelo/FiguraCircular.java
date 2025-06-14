package modelo;

import requerimiento.Requerimiento01;

public abstract class FiguraCircular implements Requerimiento01 {

    private Float radio = 0f;
    private Float area = 0f;

    public FiguraCircular() {
        // Constructor por defecto
    }

    public FiguraCircular(Float radio) {
        this.radio = radio;
    }

    public Float getRadio() {
        return radio;
    }

    public void setRadio(Float radio) {
        this.radio = radio;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }
}