import java.util.*;
public class VolumeMethod {
    public static void main(String[] args) {
        VolumeMethod obj=new VolumeMethod();
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter side of Square");
        float side=sc.nextFloat();
        float square=obj.Volume(side);
        System.out.println("the volume of Suare is "+square);

        System.out.println("please enter length,width & height of Rectangular");
        float length=sc.nextFloat();
        float width=sc.nextFloat();
        float height=sc.nextFloat();
        float rectangular=obj.Volume( length,width,height);
        System.out.println( "the volume of Rectangular is "+rectangular);
    }
    public static float Volume(float a){
        float sq=a*a*a;
        return sq;
    }
    public static float Volume(float a ,float b, float c){
        float rec=a*b*c;
        return rec;
    }

}
