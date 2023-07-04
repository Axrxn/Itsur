import java.text.DecimalFormat;

public class Circulo implements Figura {
    private double radio = 1;
    
    public Circulo(){}
    
    public Circulo(double radio){
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if(radio > 1 && radio <1000 ){
            this.radio = radio;
        }else{
            System.err.println("Radio no válido (valor entre 1 y 1000)");
        }
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
   
    @Override
    public void redimensionar(double porcentaje){
        if(porcentaje >= 0){
            double nuevoRadio = radio * porcentaje / 100;
            if(nuevoRadio > 1000){
                radio = 1000;
            }else if(nuevoRadio < 1){
                radio = 1;
            }else{
                radio = nuevoRadio;
            } 
        }else{
            System.out.println("No es posible el redimensionamiento");
        }
    }
    
    @Override
    public String toString(){
        DecimalFormat formateador = new DecimalFormat("0.00");
        return "Circulo(" + formateador.format(radio) + ")" ;
        
    }
    
    }
