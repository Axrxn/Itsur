import java.time.LocalDate;


public class Empleado extends Persona{
     private String clave;

//    public Empleado(){}
//    
//    public Empleado(String nombre){
//        //super(nombre);
//        System.out.println("Construyendo un empleado");
//    }
    public Empleado(String nombre, String correo, LocalDate fechaNac,
            String clave) {
        super(nombre, correo, fechaNac);
        setClave(clave);

    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        clave = clave.toUpperCase();

        if (clave.charAt(0) == 'G' || clave.charAt(0) == 'D') {
//            Integer x;
//            int y;
//            char c;

            for (int i = 1; i < clave.length(); i++) {
                //if(!Character.isDigit(clave.charAt(i))){
                if (Character.isDigit(clave.charAt(i)) == false) {
                    System.out.println("Clave no válida");
                    return;
                }
            }
            this.clave = clave;
        } else {
            System.out.println("Clave no válida");
        }
    }

    float calcularSueldo() {
        return 700;
    }
    
    @Override
    public String toString(){
        return "Empleado\nNombre: " + getNombre() + "\nCorreo: " + getCorreo() + 
                "\nFecha Nacimiento: " + getFechaNacimiento();
    }

}
