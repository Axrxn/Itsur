import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
  int [] [] matriz = new int[105][105];
  int n = s.nextInt();
  int m = s.nextInt();
   for(int i=0; i<n; i++){
     for(int j=0; j<m; j++){
       matriz[i][j]=s.nextInt();
     }
   }
   for(int i=0; i<n; i++){
     for(int j=m-1; j>=0; j--){
      System.out.print(matriz[i][j] + " ");
     }
     System.out.println();
    }
  }
}
