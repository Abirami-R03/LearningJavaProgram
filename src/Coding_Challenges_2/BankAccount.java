package Coding_Challenges_2;

public class BankAccount {
    int initial_balance;
    int deposit;
    int withdraw;
    double bal_afer_deposit;
    double balance_after_withdraw;

    private double getDeposit()
    {
      return bal_afer_deposit;
    }
    private void setDeposit(int initial_balance, int deposit)
    {
        this.initial_balance = initial_balance;
        this.deposit = deposit;
        this.bal_afer_deposit = initial_balance + deposit;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
        this.balance_after_withdraw = bal_afer_deposit - withdraw;
    }

    public double getBalanceAfterWithdraw() {
        return balance_after_withdraw;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setDeposit(1000, 500);    // Balance becomes 1500
        account.setWithdraw(200);         // Balance becomes 1300

        System.out.println("Balance after deposit: " + account.getDeposit() +
                " Balance after withdrawal: " + account.getBalanceAfterWithdraw());
    }
}
