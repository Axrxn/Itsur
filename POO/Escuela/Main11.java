import java.time.LocalDate;


public class PruebaToString {

   
    public static void main(String[] args) {
        Persona p = new Persona("Juan Perez" , "Juam@gmail.com", 
                LocalDate.of(2000 , 1 , 1));
        Persona d = new Persona ("Jesus Diaz", "Jesus@gmail.com", 
                LocalDate.of(2000, 2 ,2));
        System.out.println("d");
        System.out.println("p");
    }
    
}
