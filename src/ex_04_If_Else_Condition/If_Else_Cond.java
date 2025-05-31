package ex_04_If_Else_Condition;

public class If_Else_Cond {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18)
        {
            System.out.println("You are Eligible for Voting");
        }
        else
        {
            System.out.println("You are not Eligible for Voting");
        }
    }
}
