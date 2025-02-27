import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("AAAAA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,120);
        JButton b=new JButton("ss");
        frame.add(b);
        frame.add(frame);
        frame.setVisible(true);
        System.out.println("Hello world!");
    }
}