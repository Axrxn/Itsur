
import java.util.Objects;

/**
 *
 * @author Axrxn
 */
public class Circulo extends Figura {
    private double radio;
    
    public Ubicacion centro = new Ubicacion ();

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circulo other = (Circulo) obj;
        if (this.radio != other.radio) {
            return false;
        }
        
        return Objects.equals(this.centro, other.centro);

//        Opcion no recomendable por que se tiene que hacer en todas las clases,
//        lo recomendable es hacerla en una clase que lo comparta  para todas las clases que heredan
//        if(this.centro.getX() != other.centro.getX()){
//            return false;
//        }
        
//        if(this.centro.getY() != other.centro.getY()){
//            return false;
//        }
        
//        return true;
    }
    
    
}
