import java.time.LocalDate;


public class AuxiliarMedico extends Integrante{
    private String especialidad;
    private double sueldoXPartido;
    
    public AuxiliarMedico(String RFC, String nombre, String apellidos, LocalDate fechaNacimiento,
            LocalDate fechaIngreso, String especialidad, double sueldoXPartido){
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        setEspecialidad(especialidad);
        setSueldoXPartido(sueldoXPartido);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldoXPartido() {
        return sueldoXPartido;
    }

    public void setSueldoXPartido(double sueldoXPartido) {
        this.sueldoXPartido = sueldoXPartido;
    }
   
    
    @Override
    public double calcularSueldoQuincenal() {
       return 0; 
    }
    
    public double calcularSueldoQuinsenal(int partidosXMes){
        double sueldoXMes = sueldoXPartido * partidosXMes / 2;
        return sueldoXMes;
    }
    
    @Override
    public String toString() {
        return  "AUXILIARMEDICO\n" + super.toString() + "," +"Especialidad: " + especialidad + "," +
                "\nSueldo Mensual: " + sueldoXPartido;
    }
    
}
