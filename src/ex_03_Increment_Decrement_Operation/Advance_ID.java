package ex_03_Increment_Decrement_Operation;

public class Advance_ID {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++);//print and increment - 10
        System.out.println(a);//11
        int result = a++ + a;//11 +12 =23
        System.out.println(result);//23
        System.out.println(a);//12
    }
}
