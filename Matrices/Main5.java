import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  int [][] matriz = new int[105][105];
     int n = s.nextInt();
    int m = s.nextInt();
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
          matriz [i][j] = s.nextInt();
        }
    }
  int x = s.nextInt();
  double div=0;
  for(int i=0; i<n; i++){
    double sum=0;
    for(int j=0; j<m; j++){
    sum += matriz[i][j];
      div = sum / m;
  }
    if( div > x){
      System.out.printf("%.2f", div);
      }
      else{
        System.out.println();
      }
    System.out.println(" ");
   }
  }
}
