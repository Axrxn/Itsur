import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   int [][] matriz = new int [3][3];
    
    for(int i=0; i<3; i++){
      for(int j=0; j<3; j++){
        matriz[i][j] = sc.nextInt();
      }
    }
    int c=1;
    for(int i=0; i<3; i++){
      int su=0;
      for(int j=0; j<3; j++){
        su+=matriz[i][j];
      }  
      if(su!=15){
        c=0;
        break;
      }
    }
    if(c==1){
      for(int i=0; i<3; i++){
        int su=0;
      for(int j=0; j<3; j++){
        su+=matriz[j][i];
      }
        if(su!=15){
          c=0;
          break;
        }
      }
    }
    if(c==1){
        int su=0;
        for(int i=0; i<3; i++){
          su+=matriz[i][i];
        }
        if(su!=15){
          c=0;
        }
      } 
   if(c==1){
       int su=0;
       for(int i=0; i<3; i++){
         su+=matriz[i][2-i];
       }
       if(su!=15){
         c=0;
       }
     }
      if(c==1){
        System.out.print("SI");
      }
      else{
        System.out.print("NO");
      }
}
}
