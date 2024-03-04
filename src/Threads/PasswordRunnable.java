package Threads;

public class PasswordRunnable implements Runnable {
    char ch;
    String pass;
    static volatile boolean found = false;

    public PasswordRunnable(char ch, String pass) {
        this.ch = ch;
        this.pass = pass;
    }

    @Override
    public void run() {
        int len = pass.length();
        StringBuilder atk = new StringBuilder();
        atk.append(ch).append("a".repeat(len-1));
        int ctr = 0;
        while (!atk.toString().equals(pass) && ctr < Math.pow(26, len-1)-1 && !found) {
            ctr++;
            int res[] = new int[len];
            int tmp = ctr;
            for (int i = len-2, j = 1; i >= 0; i--, j++) {
                res[j] = tmp / (int) Math.pow(26, i);
                tmp = tmp % (int) Math.pow(26, i);
            }
            atk = new StringBuilder();
            atk.append(ch);
            for (int i = 1; i < len; i++) {
                atk.append((char)('a'+res[i]));
            }
            System.out.println(atk);
        }
        if (atk.toString().equals(pass)) {
            System.out.println("FOUND IT!");
            found = true;
        }
    }
}
