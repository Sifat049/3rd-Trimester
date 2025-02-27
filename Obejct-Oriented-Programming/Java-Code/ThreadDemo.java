package class_21;

class PrintingTask implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        PrintingTask p = new PrintingTask();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.start();
        t2.start();
    }
}
