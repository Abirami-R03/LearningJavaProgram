package ex_01_Java_Basics;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        int d = 11;

        System.out.println(++a + ++b);
        System.out.println(++b + a++);
        System.out.println(a++ + ++b);
        System.out.println(a++ + b++);

//  Expression and Result Table ( ERT)
//  Line no  | a  |   b | sout
        //5 | 10 | 20 | NA
        //10 | 11 | 21 | 32
        //11 | 22 | 11-->12 | 33
        //12 | 12-->13 | 23 | 35
        //13 | 13-->14 | 23-->24 | 36

        System.out.println(--c - d--);
        System.out.println(--d + c--);
        System.out.println(--d + --c);
        System.out.println(c-- + d--);
        //  Expression and Result Table ( ERT)
//  Line no  | c  |   d | sout
        //5 | 15 | 11 | NA
        //23 | 14 | 11 -->10 | 03
        //24 | 9 | 14 -->13 | 23
        //25 | 8 | 12 | 20
        //26 | 12 -->11 | 8 -->7 | 20



    }

}
