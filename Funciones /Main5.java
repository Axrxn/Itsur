import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    String b = Calificacion(a);
      System.out.println(b);
  }
   public static String Calificacion(int c) {
   String d;
     if(c > 0 && c < 6){
       d = "Reprobado";
     }
     else if(c == 6){
       d = "Suficiente";
     }
     else if(c == 7 || c == 8){
       d = "Bien";
     }
     else if(c == 9){
       d = "Sobresaliente";
     }
     else if(c == 10){
       d = "Excelente";
     }
     else{
       d = "Error";
       }
     return d;
  }
}
