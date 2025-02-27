//package class_22;

class PrinterThread extends Thread{

    public PrinterThread(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(this.getName()+": "+i);
        }
    }
}


public class ThreadExtendsDemo {
    public static void main(String[] args) {
        Thread t1 = new PrinterThread("t-1");
        Thread t2 = new PrinterThread("t-2");

        t1.start();
        t2.start();

    }
}
