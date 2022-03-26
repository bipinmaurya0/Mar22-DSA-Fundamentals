import java.util.*;
public class Method3 {
    public static void main(String[] args) {

        Method3 obj1=new Method3();
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= obj1.sample(a,b);
        System.out.println(sum);
    }
    public static int sample(int a,int b) {
        Method3 obj2 = new Method3();
        int sum1 = obj2.sample1(a, b);
        return sum1;
    }
    public static int sample1(int c,int d){
        int sum2=c+d;
        return sum2;
    }
}
