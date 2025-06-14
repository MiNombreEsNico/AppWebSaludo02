package modelo;

public class Rectangulo extends Figuras {

    public Rectangulo(   ) {



    }

    @Override
    public Float calcularArea() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
        
        Float a = this.getAltura() * this.getBase();

         return a;

    }





}
