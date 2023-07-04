import java.time.LocalDate;


public class General extends Empleado {
    public General(String nombre, String correo, LocalDate fechaNac,
            String clave){
        super(nombre,correo,fechaNac,clave);
        setSueldoBase(sueldoBase);
    }
    
    private float sueldoBase;

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    
    @Override
    public float calcularSueldo(){
        return super.calcularSueldo() + sueldoBase;
    }
    
}
