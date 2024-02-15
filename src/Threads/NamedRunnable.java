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
        int ctr = 0;
        for (int i = start; i<= end; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                ctr++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thread" + id + "Total prime numbers: " + ctr);
        System.out.println("Thread" + id + "Total time: " + (endTime-startTime));
    }

}
