package ex_01_Java_Basics;

public class ValidAndInvalidSyntax {
    public static void main(String[] args) {
        int _2 = 8;
        //int &5 = 10; --Invalid Assignment
        //int $ = 20; --Invalid Assignment
        //int _This.is.valid&Invalid = 72; --Invalid Assignment
        //int enum = 10;--Invalid Assignment its keyword
        //int File Powersaver = 20; Invalid Space will not allow
        boolean ValidAndInvalidSyntax = true; //Class name and datatype can be same
        int Enum =10;
        int _This$ = 62;
        System.out.println(_2);
       // System.out.println(&5);
       // System.out.println($);
       // System.out.println(_This.is.valid&Invalid);
        System.out.println(_This$);
        System.out.println(Enum);

    }
}
