import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int[][] matriz = new int[n+2][m+2];
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        matriz[i][j] = s.nextInt();
      }
    }
    for(int i=0; i<n; i++){
      int sum=0;
      for(int j=0; j<m; j++){
        sum+= matriz[i][j];
      }
      System.out.println(sum);
    }
  }
}
