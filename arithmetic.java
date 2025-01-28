import java.lang.System;
import java.util.Scanner;

class hello {
    public static void main(String args[])
     {
        Scanner charlie=new Scanner(System.in);
      int a=charlie.nextInt();
      int b=charlie.nextInt();
      int c=charlie.nextInt();
      int d=a*b*c;
      int e=a+b+c;

      System.out.println(d/e);
       }
    }
