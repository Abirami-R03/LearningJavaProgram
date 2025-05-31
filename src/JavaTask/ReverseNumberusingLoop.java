package JavaTask;

public class ReverseNumberusingLoop {
    public static void main(String[] args) {

        int num = 12345;
        int reverse = 0;
        for(;num!=0;num=num/10)//1234,123,12
        {
            int digit = num%10;//5,4,3,2
            num = num*reverse + digit;

        }
        System.out.println("Reversed String:" + num);
    }
}
