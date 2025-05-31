package ex_02_Java_Operator;

public class Logical_Operator
{
    public static void main(String[] args) {
        // ||-->OR operator
        // &&--> AND operator
        // ! = Not Operator
        boolean a= true;
        System.out.println(!a); //false

        boolean b=false;
        System.out.println(!!b); //false

        boolean c = a||b;
        System.out.println(a);//true
        System.out.println(b);//false
        System.out.println(c); //true||false -->true

        boolean d = a&&b;
        System.out.println(d); //true&&false -->false

    }
}
