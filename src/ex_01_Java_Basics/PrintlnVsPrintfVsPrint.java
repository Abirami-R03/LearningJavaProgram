package ex_01_Java_Basics;

public class PrintlnVsPrintfVsPrint {
    public static void main(String[] args) {
        int a=10;
        System.out.print(a); // without adding new line
        System.out.println(a);//Adding new line after print
        //System.out.println("Your Variable is %d",a); -- this format not accepted in println
        System.out.printf("Your Variable is %d",a);
        //%d -- int,byte,long,short
        //%f -- float,double
        //%s -- String
        //%b -- boolean
        //Printf is formating String Syntax
        int b=10;
        System.out.printf("%d" + "%d",a,b);//separate quote so it consider as separate variable,it perform concat not addition
        System.out.printf("%d + %d",a,b);
        //it is double quote it consider as single string and print as it is
        System.out.printf("a = %d,b= %d",a,b);
        System.out.println("a="+ a +","+"b="+ b);//instead of avoid confusion we are using Printf

    }
}
