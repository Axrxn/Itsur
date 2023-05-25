import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();
    String d = Igual (a, b, c);
    System.out.println(d);
  }
   public static String Igual(int a, int b, int c) {
    String v;
    if((Math.pow(a,2)) + (Math.pow(b,2)) == (Math.pow(c,2))){
       v="Si";
     }
    else if((Math.pow(c,2)) + (Math.pow(a,2)) == (Math.pow(b,2))){
       v="Si";
     }
    else if((Math.pow(b,2)) + (Math.pow(c,2)) == (Math.pow(a,2))){
       v="Si";
     }
    else{
       v="No";
     }
     return v;
  }
}
