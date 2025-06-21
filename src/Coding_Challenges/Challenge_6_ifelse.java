package Coding_Challenges;

public class Challenge_6_ifelse {
    public static void main(String[] args) {
        String input = args[0];
        System.out.println(input instanceof String);//To verify b is String
        System.out.println(input);
        int a = Integer.parseInt(input);
        if(a==0)
        {
            System.out.println(a + " is Zero");
        }
        else if (a%2==0) {
            System.out.println(a + " is Positive");
        }
        else
        {
            System.out.println(a + " is Negative");
        }
    }
}
