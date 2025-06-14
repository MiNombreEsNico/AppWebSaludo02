package modelo;

public class TrianguloRectangulo extends Figuras  {

    public TrianguloRectangulo() {

    }

    @Override
    public Float calcularArea() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");

        Float a = (this.getAltura() * this.getBase()) / 2;

       return a;
    }

    

    
}
