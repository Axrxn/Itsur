import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 java.util.Scanner s = new Scanner (System.in);
    int [] [] matriz = new int [1005] [1005];
    int n = s.nextInt();
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        matriz [i] [j] = s.nextInt();
      }
    }
    int suma=0;
    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        suma+=matriz[j][i];
      }
      System.out.print(suma + " ");
        suma=0;
    }
  }
}
