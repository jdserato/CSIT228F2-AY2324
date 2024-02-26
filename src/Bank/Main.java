package Bank;

public class Main {
    public static void main(String[] args) {
        Account acct = new Account("Vince", 1000);
        Thread shopee = new Thread(new WithdrawRunnable(acct, 700));
        Thread lazada = new Thread(new WithdrawRunnable(acct, 500));
        Thread hoyo = new Thread(new WithdrawRunnable(acct, 280));
        hoyo.start();
        lazada.start();
        shopee.start();
        int ctr = 0;
        while (true) {
            System.out.println("After " + ctr + " seconds");
            System.out.println("Hoyo: " + hoyo.getState());
            System.out.println("Lazada: " + lazada.getState());
            System.out.println("Shopee: " + shopee.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            ctr++;
            System.out.println("Balance: " + acct.money);
        }
    }
}
