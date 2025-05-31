package ex_02_Java_Operator;

public class Interview_Question3 {
    public static void main(String[] args) {
        int abi_salary = 12;
        boolean b = (!(abi_salary>10 ||(abi_salary<5)));
        //12>10-->true
        //12<5-->false
        //true||false-->true
        //!true-->false
        System.out.println(b);
    }
}
