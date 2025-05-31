package ex_04_If_Else_Condition;

public class IfElse_Cond_Ex {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>25)
        {
            System.out.println("You can Go to Goa and Drink");
        }
        else {
            System.out.println("You Can't Go to Goa-->No Travel and Party");
        }
    }
}
