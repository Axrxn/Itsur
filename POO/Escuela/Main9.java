import java.time.LocalDate;


public class PruebaEquals {
    public static void main(String[] args) {
        String cadena = "Hola";
        System.out.println(cadena.equals(5));
        System.out.println(cadena.equals("hola"));
        System.out.println(cadena.equals(null));
        
        Persona p = new Persona("Juan Perez", "juan@gmail.com",
                LocalDate.of(2000, 1, 1));
        Persona p1 = new Persona("Juan Perez", "juan@gmail.com",
                LocalDate.of(2000, 1, 1));
        Persona p2 = new Persona("JUAN DAVID", "", null);
        System.out.println("Igualdad de personas " + p.equals(p1));
        System.out.println("Igualdad de personas " + p.equals(p));
        System.out.println("Igualdad de personas " + (p == p1));
        //p = p1;
        System.out.println("Igualdad de personas " + p.equals(p1));
        System.out.println("Igualdad de personas " + p.equals(p2));
//        System.out.println("Igualdad de personas " + p.equals(5));
//        System.out.println("Igualdad de personas " + p.equals("Juan David"));
        System.out.println("Igualdad de personas " + p.equals(null));
        
        Empleado e = new Empleado("Juan David", "", null , "1");
            System.out.println(p.equals(e));
        
            
            
            

    }
    
}
