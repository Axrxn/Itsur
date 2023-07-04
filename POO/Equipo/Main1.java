import java.time.LocalDate;


public class Jugador extends Integrante{
    private String nacionalidad;
    private String posicion;
    private String equipoProcedencia;
    private LocalDate finContrato;
    private double sueldoAnual; 
    
    public Jugador(String RFC, String nombre, String apellidos, LocalDate fechaNacimiento,
            LocalDate fechaIngreso , String nacionalidad, String posicion, String
                    equipoProcedencia, LocalDate finContrato, double suedoAnual){
        super(RFC, nombre, apellidos, fechaNacimiento, fechaIngreso);
        setNacionalidad(nacionalidad);
        setPosicion(posicion);
        setEquipoProcedencia(equipoProcedencia);
        setFinContrato(finContrato);
        setSueldoAnual(sueldoAnual);
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoProcedencia() {
        return equipoProcedencia;
    }

    public void setEquipoProcedencia(String equipoProcedencia) {
        this.equipoProcedencia = equipoProcedencia;
    }

    public LocalDate getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(LocalDate finContrato) {
        this.finContrato = finContrato;
    }

    public double getSueldoAnual() {
        return sueldoAnual;
    }

    public void setSueldoAnual(double sueldoAnual) {
        this.sueldoAnual = sueldoAnual;
    }
    
    public double CalculaSulAnual(){
        double sueldo = sueldoAnual / 26;
        return sueldo;
    }
    
    @Override
    public double calcularSueldoQuincenal() {
       return 0; 
    }
    
    @Override
    public String toString(){
        return "JUGADOR\n" + super.toString() + "," + "Nacionalidad: " + nacionalidad + "," + "\nPosicion: " + posicion +
                "," + "\nEquipo procedencia: " + equipoProcedencia + "," + "\nFin Contrato: "
                + finContrato + "," + "\nSueldo Anual: " + sueldoAnual;
    }
    
}
