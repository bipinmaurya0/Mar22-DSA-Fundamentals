import java.util.*;
public class Method1 {
    public static void main(String [] args){
        Method1 object=new Method1();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean check=object.sample(a);
        System.out.println(check);
    }
    public static boolean sample(int a){
        if (a>10){
            return true;
        }
        else {
            return false;
        }
    }
}
