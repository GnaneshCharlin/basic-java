import java.lang.System;
import java.util.Scanner;
class hello {
    public static void main(String args[])
     {
      Scanner charlie=new Scanner(System.in);
      System.out.println("enter age");
      
    int age=charlie.nextInt();
    System.out.println("enter salary");
    int salary=charlie.nextInt();
    
    if (age<25 || salary<=20000) {
      System.out.println("eligible for loan");
      System.out.println("enter required loan amt");
      int loan=charlie.nextInt();
      if(loan<=50000){
        System.out.println("loan available");
      }
      else{
        System.out.println("not available");
      }   
    }
    else{
      System.out.println("not eligible");
    }
   
     }
    }
     
      
      


