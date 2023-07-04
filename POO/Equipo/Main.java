import java.time.LocalDate;


public class Integrante {
    private String RFC;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private LocalDate fechaIngreso;
    
    public Integrante(String RFC, String nombre, String apellidos, LocalDate fechaNacimiento,
            LocalDate fechaIngreso){
        setRFC(RFC);
        setNombre(nombre);
        setApellidos(apellidos);
        setFechaNacimiento(fechaNacimiento);
        setFechaIngreso(fechaIngreso);
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        RFC = RFC.trim();
        RFC = RFC.toUpperCase();
        if(RFC.length() >= 1 && RFC.length() <= 12){
            this.RFC = RFC;
        }else{
            System.err.println("RFC no válido (entre 1 y 12 caracteres)");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    public int calcularAnios() {
        LocalDate fechaActual = LocalDate.now();
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if(fechaNacimiento.getMonthValue() > fechaActual.getMonthValue()){
            anios--;
        }else if(fechaNacimiento.getMonthValue() == fechaActual.getMonthValue()){
            if(fechaNacimiento.getDayOfMonth() > fechaActual.getDayOfMonth()){
                anios--;
            }
        }
        return anios; 
    }
    
    public int calcularAntiguedad() {
        LocalDate fechaActual = LocalDate.now();
        int antiguedad = fechaActual.getYear() - fechaIngreso.getYear();
        if(fechaIngreso.getMonthValue() > fechaActual.getMonthValue()){
            antiguedad--;
        }else if(fechaIngreso.getMonthValue() == fechaActual.getMonthValue()){
            if(fechaIngreso.getDayOfMonth() > fechaActual.getDayOfMonth()){
                antiguedad--;
            }
        }
        return antiguedad; 
    }
    
    public double calcularSueldoQuincenal() {
       return 0; 
    }
    
    @Override
    public String toString() {  
        return "RFC: " + RFC + "," + "\nNombre: " + nombre +  apellidos +
                "," + "\nFecha Nacimiento: " + fechaNacimiento + "," +
                "\nFecha Ingreso: " + fechaIngreso;
    }
    
    
    }
