package ex_02_Java_Operator;

public class BODMAS {
    public static void main(String[] args) {
        System.out.println((9 * 3 / 9 + 1) * 3);
        //9*3 =27
        //27/9 =3
        //3+1 = 4
        //4*3=12
        System.out.println((6*10/5/2+1)*5+(1+3));
        //6*10=60
        //60/5=12
        //12/2=6
        //6+1=7
        //7*5=35
        //1+3=4
        //35+4=39
    }
}
/*
Output
12
39
 */