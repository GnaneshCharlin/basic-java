import java.lang.System;
import java.util.Scanner;
class hello{
    public static void main(String [] args){
        Scanner mat=new Scanner(System.in);
        int charlie[][]=new int[3][3];
        System.out.println("enterb 9 elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                charlie[i][j]=mat.nextInt();
            }
        }
        System.out.println("charlie");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print(charlie[i][j]+"");
            }
            System.out.println();
        }
        mat.close();
    }
}
