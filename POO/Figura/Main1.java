import java.util.ArrayList;

/**
 *
 * @author Axrxn
 */
public class Triangulo extends Figura{
    private double base;
    private double altura;
    public ArrayList<Ubicacion> vertices = new ArrayList <>();

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
       double c = Math.sqrt(altura * altura) + Math.sqrt(base * base);
       return c * 2 + base;
    }
    
    
}
