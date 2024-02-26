package Bank;

public class Account {
    String name;
    int id;
    double money;

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    synchronized boolean withdraw(double amount) {
        if (amount <= money) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
//            assert money - amount >= 0;
            money -= amount;
            return true;
        }
        return false;
    }
}
