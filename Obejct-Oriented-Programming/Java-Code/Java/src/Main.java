import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SIFAT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,255);
        JLabel label= new JLabel("NAME:");
        JPanel panel=new JPanel();
        panel.setBackground(Color.BLUE);
        JButton b=new JButton("click|");
        //frame.add(b);
           panel.add(b);
           frame.add(panel);
//        JTextField textField = new JTextField("TEXT");
//        frame.add(label);
//        frame.add(textField);
        frame.setVisible(true);
    }
}