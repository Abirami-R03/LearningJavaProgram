package ex_02_Java_Operator;

public class Concat_Interview_Question {
    public static void main(String[] args) {
        int a = 10, b=20;
        String c= "Abirami", d="Ravichandran";
        System.out.println(a+b); //For int, it act as Math addition
        System.out.println(c+d); //for String, it act as Join
        System.out.println(c+" "+d);//for space between 2 string,we can add blank space in double quote
        System.out.println(a+d);//if we have both int and string it joins
    }
}
/*Output
30
AbiramiRavichandran
Abirami Ravichandran
10Ravichandran*/
