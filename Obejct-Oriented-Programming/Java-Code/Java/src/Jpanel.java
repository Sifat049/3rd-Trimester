import javax.swing.*;
import java.awt.*;

public class Jpanel {
    public static void main(String[] args) {
        JFrame frame=new JFrame("My Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        JPanel panel=new JPanel();
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();

        JLabel label=new JLabel("Label 01");
        JTextField textField=new JTextField(15);

        panel.add(label);
        panel.add(textField);
        frame.add(panel);

        JButton b1=new JButton("Button:1");
        JButton b2=new JButton("Button:2uu");
        JButton b3=new JButton("Button:3");

        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);

        frame.setLayout(new FlowLayout());

        frame.add(panel1);




        frame.setVisible(true);
    }
}
