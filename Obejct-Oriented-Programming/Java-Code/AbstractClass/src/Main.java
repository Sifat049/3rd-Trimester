abstract class abstractClass  {

    void  call()
    {
        System.out.println("call me");
    }
    abstract void sendMessage();//ABSTRACT METHOD
    abstract void mark();
}

class Sifat extends abstractClass {

    @Override
    void mark() {
        System.out.println("return 0");

    }

    void sendMessage() {
        System.out.println("Hi,I am SIFAT");
    }
}

class Tashfiq extends abstractClass {
    void mark(){
        System.out.println("NUMBER");

    }
    void sendMessage() {
        System.out.println("Hi,I am Tashfiq");
    }
}


public class Main {
    public static void main(String[] args) {

        abstractClass ab;
        ab = new Sifat();
        ab.sendMessage();
        ab.mark();
        ab.call();

        ab = new Tashfiq();
        ab.call();
        ab.mark();
        ab.sendMessage();

    }
}