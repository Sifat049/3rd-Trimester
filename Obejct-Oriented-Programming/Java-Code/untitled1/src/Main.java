import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(730,220);

        //PANEL
        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
       // JPanel panel3=new JPanel();


        //LABEL
        JLabel label=new JLabel("Label-01");

        //TEXTFIELD
        JTextField textField = new JTextField(12);

        //ADDING PANEL
        panel1.add(label);
        panel1.add(textField);

        //BUTTON
        JButton button1=new JButton("Button1");
        JButton button2=new JButton("Button2");
        JButton button3=new JButton("Button3");



        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);

        frame.setLayout(new FlowLayout());

        //ADDING FRAME
        frame.add(panel1);
        frame.add(panel2);
       // frame.add(panel3);

        // COLOR
        button3.setBackground(Color.blue);
        button2.setForeground(Color.CYAN);

        panel1.setBackground(Color.ORANGE);

        frame.setVisible(true);
        System.out.println("Hello world!");
    }
}