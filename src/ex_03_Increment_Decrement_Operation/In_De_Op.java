package ex_03_Increment_Decrement_Operation;

public class In_De_Op {
    public static void main(String[] args) {
        // If the argument are less -= java.lang.ArrayIndexOutOfBoundsException
        String age = args[0];//Incrementage1
        String a1 = args[1];//65
        String a2 = args[2];//4 or 4.5
        String a3 = args[3];//922929
        String a4 = args[4];//72333.5

        System.out.println(age);
        int inte = Integer.parseInt(a1);
        System.out.println(a1);
        float floats = Float.parseFloat(a2);
        System.out.println(floats);
        long Phno = Long.parseLong(a3);
        System.out.println(Phno);
        double d = Double.parseDouble(a4);
        System.out.println(a4);

    }
}
