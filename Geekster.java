import java.util.*;
public class Geekster {
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in) ;

       int num=sc.nextInt();
       int space=num-1;
       int star=1;
       for(int i=1; i<=num;i++)
       {
           for(int j=1; j<=space; j++) {
               System.out.print("\t");
           }
           for(int k=1; k<=star ; k++)
           {
               System.out.print("*\t");
           }
           space--;
           star +=2;
           System.out.println();
       }
    }
}
