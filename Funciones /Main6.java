import java.util.Scanner;
class Main{
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
  int m = s.nextInt();
   int sc = s.nextInt();
    int t = s.nextInt();
    int e = tiempo(m,sc,t);
    System.out.println(e);
  }
  public static int tiempo(int a,int b, int d) {
  int k;
  int c=0;
  c = a * 60;
  k = c + b * d;
  return k;
}
}
