package Bank;

public class WithdrawRunnable implements Runnable{
    Account account;
    double amount;

    public WithdrawRunnable(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("STATUS: " + account.withdraw(amount));
        System.out.println("Balance: " + account.money);
    }
}
