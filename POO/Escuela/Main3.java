import java.time.LocalDate;


public class Docente extends Empleado {
     private int hrsXSemana;
    private float sueldoXHora;

//    public Docente(String nombre){
//        super(nombre);
//        System.out.println("Construyendo un docente");
//    }
    public Docente(String nombre, String correo, LocalDate fechaNac,
            String clave, int hrsXSemana, float sueldoXHora) {
        super(nombre, correo, fechaNac, clave);
        setHrsXSemana(hrsXSemana);
        setSueldoXHora(sueldoXHora);
    }

    public int getHrsXSemana() {
        return hrsXSemana;
    }

    public void setHrsXSemana(int hrsXSemana) {
        this.hrsXSemana = hrsXSemana;
    }

    public float getSueldoXHora() {
        return sueldoXHora;
    }

    public void setSueldoXHora(float sueldoXHora) {
        this.sueldoXHora = sueldoXHora;
    }

    @Override
    public float calcularSueldo() {
        float sueldoBase = super.calcularSueldo();
        sueldoBase += sueldoXHora * hrsXSemana * 2;
        return sueldoBase;
    }

    public float calcularSueldo(float bono) {
        return calcularSueldo() + bono;
    }

    public void imprimirDatos() {
        System.out.println(getNombre());
        System.out.println(getCorreo());
        System.out.println(getFechaNacimiento());
        System.out.println(getClave());
        System.out.println(hrsXSemana);
        System.out.println(sueldoXHora);
        System.out.println(calcularSueldo());
    }
    
    @Override
    public String toString(){
        return "PERSONA\nNombre: " + getNombre() + "\nCorreo: " + getCorreo() + 
                "\nFecha Nacimiento: " + getFechaNacimiento();
    }
}
