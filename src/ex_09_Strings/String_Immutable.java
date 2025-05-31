package ex_09_Strings;

public class String_Immutable {
    public static void main(String[] args) {
        String name = "Abirami"; //String Constant Pool
        name.toUpperCase(); //Immutable because it not assigned
        System.out.println(name);//o/p--Abirami
    }
}
