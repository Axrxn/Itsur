import java.time.LocalDate;


public class Entrenador extends Integrante{
    private int aniosExperiencia;
    private double sueldoMensual;
    
    public Entrenador(String RFC,String nombre, String apellidos, LocalDate fechaNacimiento,
            LocalDate fechaIngreso,int aniosExperincia, double sueldoMensual ){
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        setAniosExperiencia(aniosExperiencia);
        setSueldoMensual(sueldoMensual);
        
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }
    
     public double CalcularSueldo(){
        double sueldo = sueldoMensual / 2;
        return sueldo;
    }
    
    @Override
    public double calcularSueldoQuincenal() {
       return 0; 
    }
    
    @Override
    public String toString() {
        super.toString();
        return "ENTRENADOR\n" + super.toString() + "," + "Anios Experiencia: " + aniosExperiencia + "," +
                "\nSueldo Mensual: " + sueldoMensual;
    }
    
}
