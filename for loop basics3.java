import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
      Scanner charlie=new Scanner(System.in);
      System.out.println("enter a");
      int a=charlie.nextInt();
      System.out.println("enter b");
      int b=charlie.nextInt();
      System.out.println("");
      for(int i=a;i<=b;i++)
      System.out.println(i);
     }
    }
