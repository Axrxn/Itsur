import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
    int n= s.nextInt();
    int m = s.nextInt();
    int [][] matriz = new int [n+2][m+2];
    int [][] b = new int [n+2][m+2];
    int [][] c = new int [n+2][m+2];
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        matriz[i][j]=s.nextInt();
      }
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        b[i][j]=s.nextInt();
      }
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        c[i][j] =  (matriz[i][j]) + b[i][j];
      }
    }
    for(int i=0; i<n; i++){
      for(int j=0; j<m; j++){
        System.out.print(c[i][j] + " ");
      }
       System.out.println(" ");
    }
}
}
