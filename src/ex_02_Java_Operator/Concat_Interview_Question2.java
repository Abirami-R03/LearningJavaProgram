package ex_02_Java_Operator;

public class Concat_Interview_Question2 {
    public static void main(String[] args) {
        String first_name = "Abirami", last_name = "Vinoth";
        int wedding_Date=21;
        int a =10, b=20;
        System.out.println(first_name+last_name+wedding_Date);
        System.out.println(first_name+last_name+(a+b)); // BODMAS - Bracket of Div, mul, add, sub
        //as per bodmas (a+b) will perform it is in bracket then perform addition inside
        System.out.println(wedding_Date+first_name+last_name);

    }
}
/*Output
AbiramiVinoth21
AbiramiVinoth30
21AbiramiVinoth
 */