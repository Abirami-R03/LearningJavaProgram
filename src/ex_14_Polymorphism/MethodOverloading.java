package ex_14_Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        MathematicOperation m = new MathematicOperation();
        int addtwo = m.add(5,6);//During Compile time it match exact paramter even with same name also
        System.out.println(addtwo);
        int addthree = m.add(5,6,7);
        System.out.println(addthree);
        int multiply = m.multiply(9,10,99);
        System.out.println(multiply);
    }
}
