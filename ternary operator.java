import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
      Scanner charlie=new Scanner(System.in);
      System.out.println("enter the number 1");
    int n1=charlie.nextInt();
    System.out.println("enter the number 2");
    int n2=charlie.nextInt();
    String result=n1>n2? "n1 is greater":"n2 is greater";
    System.out.println(result);
     }
    }
