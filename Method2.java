import java.util.*;

public class Method2 {
    public static void main(String [] args){
        Method2 object=new Method2();
        Scanner sc=new Scanner(System.in);
        float  a=sc.nextFloat();
        float  b=sc.nextFloat();
        float sum=object.sample(a ,b);
        System.out.println(sum);
    }
    public static float sample(float c, float d){
        float sum=c+d;
        return sum;
    }
}
