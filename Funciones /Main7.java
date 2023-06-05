import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   String b = Edad (n);
    System.out.println(b);
  }
  public static String Edad(int a){
    String x = " ";
    if(a > 0 && a <= 3){
      x = "BEBE";
    }
    else if(a > 4 && a <= 14){
      x = "NINO";
    }
    else if(a > 15 && a <= 18){
      x = "JOVEN";
    }
    else if(a > 19 && a <= 65){
      x = "ADULTO";
    }
    else if(a > 66 && a <= 99){
      x = "ADULTO 3RA";
    }
      return x;
  }
}
