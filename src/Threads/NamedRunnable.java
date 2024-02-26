package Threads;

public class NamedRunnable implements Runnable{
    int id, start, end;
    private String name;
    NamedRunnable(String name, int id, int start, int end) {
        this.name = name;
        this.id = id;
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("WAKING UP HEHE");
        }
        System.out.println("Continuing to work");
        int ctr = 0;
        for (int i = start; i<= end; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                ctr++;
                updateTP();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thread" + id + "Total prime numbers: " + ctr);
//        MainThread.totalprime += ctr;
        System.out.println("Updated value of totprime = " + MainThread.totalprime);
        System.out.println("Thread" + id + "Total time: " + (endTime-startTime));
    }

    private static synchronized void updateTP() {
        MainThread.totalprime++;
    }

}
