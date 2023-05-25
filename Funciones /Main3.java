import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int a = s.nextInt();
  int b = s.nextInt();
  double c = Pitagoras(a,b);
  System.out.printf("%.3f", c);
  }
  public static double Pitagoras(int a, int b){
    double c;
    int a1 = a * a;
    int b1 = b * b;
    c = a1 + b1;
    c = Math.sqrt(c);
    return c;
  }
}
