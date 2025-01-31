import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
      Scanner charlie=new Scanner(System.in);
    int n=charlie.nextInt();
    
    if (n%3==0 && n%15==0)
      System.out.println("divisable");

      else if (n%3==0) 
        System.out.println("divisable by 3");

        else if (n%15==0) 
        System.out.println("divisable by 15");                
else
   System.out.println("not divisable");
 
     }
    }
