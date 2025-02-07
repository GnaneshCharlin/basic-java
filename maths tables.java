import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
      Scanner charlie=new Scanner(System.in);
      int num=charlie.nextInt();
      
      for(int i=1;i<=10;i++)
      {
        System.out.println(num+"X"+i+"="+(num*i));
      }
    }
    }
