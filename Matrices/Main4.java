import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
    int n = s.nextInt();
    int m = s.nextInt();
    int pa=0, im=0;
    int bk=0, bl=0;
    int [] [] matriz = new int[n][m];
   for(int i=0; i<n; i++){
     for(int j=0; j<m; j++){
      int c = s.nextInt();
       matriz[i][j]=c;
     }
   }
    int k = s.nextInt();
    int l = s.nextInt();
   for(int i=0; i<n; i++){
     for(int j=0; j<m; j++){
        if(matriz[i][j]%2==0){
          pa++;
        }
       else{
         im++;
       }
      }
    }
    System.out.print(pa + " " + im);
    System.out.println();
    for(int i=0; i<n; i++){
      for(int j=0;j<m; j++){
        if(matriz[i][j]==k){
          bk=1;
        }
        if(matriz[i][j]==l){
          bl=1;
        }
      }
    }
    if(bk==1 && bl==1){
      System.out.println("NO JAQUE");
    }
    else{
      System.out.println("JAQUE MATE");
    }
  }
}
