import java.text.DecimalFormat;


public class TrianguloRectangulo implements Figura {
    private double base = 1;
    private double altura = 1;
    
    public TrianguloRectangulo(){}
    
    public TrianguloRectangulo(double altura, double base){
      setAltura(altura);
      setBase(base);
    }
    
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base >= 1 && base <= 1000){
            this.base = base;
        }else{
             System.err.println("Base no válida (valor entre 1 y 1000)");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura >= 1 && altura <= 1000){
            this.altura = altura;
        }else{
             System.err.println("Altura no válida (valor entre 1 y 1000)");
        }
    }

    @Override
    public double calcularPerimetro() {
        return base + altura + Math.sqrt(altura * altura + base * base);
    }

    @Override
    public double calcularArea() {
        return base * altura / 2; 
    }
    
    @Override
    public void redimensionar(double porcentaje){
        if(porcentaje >= 0){
            double nuevaBase = base * porcentaje / 100;
            double nuevaAltura = altura * porcentaje / 100;
            if(nuevaBase > 1000){
                base = 1000;
            }else if(nuevaBase < 1){
                base = 1;
            }else{
                base = nuevaBase;
            } 
              if(nuevaAltura > 1000){
                altura = 1000;
            }else if(nuevaAltura < 1){
                altura = 1;
            }else{
                altura = nuevaAltura;
            } 
        }else{
            System.out.println("No es posible el redimensionamiento");
        }
    }
    
    @Override
    public String toString() {
         DecimalFormat formateador = new DecimalFormat("0.00");
        return "TrianguloRectangulo(" + formateador.format(base) +
                "," + formateador.format(altura) + ")" ;
    }
    
    
}
