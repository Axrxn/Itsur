import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String a = Figura (n);
    System.out.println(a);
  }
   public static String Figura(int b){ 
  String x;
  if(b == 1){
     x = "PUNTO";
  }
  else if(b == 2){
    x = "LINEA";
  }
  else if(b == 3){
    x = "TRIANGULO";
  }
  else if(b == 4){
     x = "CUADRILATERO";
  }
  else{ 
     x = "POLIGONO";
  }
     return x;
  }
}
