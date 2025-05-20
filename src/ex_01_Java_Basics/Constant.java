package ex_01_Java_Basics;

public class Constant {

    public static void main(String[] args) {
        int a1;
        //System.out.println(a1);//it will give error JVM will not assign default value of local variable
        int a=10;
        System.out.println(a);
        final int b = 20;//final won't change,it assign only once
        //b=b+1;//not possible it shows error
        System.out.println(b);
        int c=b+1;
        System.out.println(c);
        float f1 =3.14f;
        final float f2 =3.14f;
        System.out.println(f1=f1+10);
        //System.out.println(f2=f2+1);//not possible
        System.out.println(f2);
    }
}
