import java.time.LocalDate;


public class Casting {
    public static void main(String[] args) {
       int x=5,y=5;
        System.out.println(x==y);
        String a="Hola";
        String b="Hola";
        String c="H"+"ola";
        System.out.println(a==b);
        System.out.println(a==c);
        Persona p=new Persona("","",LocalDate.now());
        Persona p1=new Docente("","",LocalDate.now(),"D1",1,1);
        Docente d=new Docente("","",LocalDate.now(),"D1",1,1);
        Docente d1=new Docente("","",LocalDate.now(),"D1",1,1);
        //Conversión no válida
        //d=(Docente) p;
        d=(Docente) p1;
        System.out.println(p1==d);
        System.out.println(d1==d);
        
    }
}
