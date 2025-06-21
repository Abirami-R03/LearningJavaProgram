package Coding_Challenges;

public class Challenge_5 {
    public static void main(String[] args) {
        int a = 10;
        float f = 3.5f;
        float c = a;//Implicit
        int d = (int)f;//Explicit
        System.out.println("Expression Result:" + ((a*2)+d));
        System.out.println("Implicit Casting: " + (c+f));

        System.out.println("Explicit Casting: " + (a+d));
    }
}
