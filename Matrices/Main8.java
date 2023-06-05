import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[][] matriz = new int[n+2][n+2];
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        matriz[i][j] =s.nextInt();
      }
    }
    for(int i=0; i<n; i++){
      for(int j=n-1; j>=0; j--){
         System.out.print(matriz[j][i] + " ");
      }
      System.out.println(" ");
    }
  }
}
