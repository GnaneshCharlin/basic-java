import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
        Scanner charlie=new Scanner(System.in);
      String name=charlie.nextLine();
      double score=charlie.nextDouble();
      charlie.nextLine();
      String dept=charlie.nextLine();

      System.out.println("my name is " +name);
      System.out.println("my score is " +score/10);
      System.out.println("my dept is " +dept);
       }
    }
