import javax.swing.*;

public class Main {


        public static void main(String[] args) {
            JFrame frame=new JFrame("First APP");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600,300);
            frame.add(frame);
            frame.setVisible(true);

    }
}