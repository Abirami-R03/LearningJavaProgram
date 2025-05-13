package ex_01_Java_Basics;

public class InputPassedStringToInt {

    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        String c = args[0];// here i provide String c = args[0]; pass 2 ip only Abirami 25 resue it
        //String c = args[2]; we need to pass 3 ip otherwise ArrayIndexOutofBoundsException error
        System.out.println(b instanceof String);//To verify b is String
        System.out.println(b);
        int d = Integer.parseInt(b);//convert string to int
        Float e = Float.parseFloat(b);//convert String to Float
        System.out.println(b instanceof String);//after conversion To verify b is String or int
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);


    }
}
