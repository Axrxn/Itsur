import java.util.Scanner;
public class Main1
{

    
    public static void main(String[] args) 
    {
       Scanner s= new Scanner(System.in); 
      String a=s.nextLine();
      String b="";
       for(int i=a.length()-1;i>=0; i--)
       {
          b=b+a.charAt(i);
       }
      System.out.println(b);
    }
    
}
