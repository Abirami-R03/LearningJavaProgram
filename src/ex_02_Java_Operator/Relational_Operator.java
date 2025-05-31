package ex_02_Java_Operator;

public class Relational_Operator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30,f=20;
        boolean d = a > b;
        System.out.println(d);//10>20 -- false
        boolean e = a<c;
        System.out.println(e);//10<30 -- true
        boolean g =b>=f;
        System.out.println(g);//20>=20 -- true
        boolean h=a<=b;
        System.out.println(h);//10<=20 -- true
        boolean i=b==f;
        System.out.println(i);//20==20 -- true
        boolean j = a!=b;
        System.out.println(j);//10!=20 -- true
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to
        // != -> Not equal
    }
}
