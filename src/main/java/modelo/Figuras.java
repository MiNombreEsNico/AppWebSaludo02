package modelo;

import requerimiento.Requerimiento01;

public abstract class Figuras implements Requerimiento01  {

    private Float altura = 0f;
    private Float base = 0f;
    private Float area = 0f;
    
    public Figuras() {
        // TODO Auto-generated constructor stub
    }

    public Float getAltura() {
        return altura;
    }
    public void setAltura(Float altura_p) {
        altura = altura_p;
    }
    public Float getBase() {
        return base;
    }
    public void setBase(Float base) {
        this.base = base;
    }
    public Float getArea() {
        return area;
    }
    public void setArea(Float area) {
        this.area = area;
    }

    


}
