import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int[][] matriz = new int[1005][1005];
  int n = s.nextInt();
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
    matriz[i][j] = s.nextInt();
    }
  }
  int c=0;
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){ 
      if(i == j){ 
    c += matriz[i][j];
        }
      }
    }
    int c1=0;
    int j = n-1;
  for(int i=0; i<n; i++){ 
    c1 += matriz[i][j];
    j--;
    }
    if(c == c1){
     System.out.println("Iguales"); 
    }
    else{
    System.out.println("No Iguales");
    }
  }
}
