import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = Numero(a,b);
    System.out.println(c);
  }
  public static int Numero(int a, int b) {
    int c=0;
    int d=7;
    if(a == d){
      c++;
    }
   if(b == d){
      c++;
    }
    return c;
  }
}
