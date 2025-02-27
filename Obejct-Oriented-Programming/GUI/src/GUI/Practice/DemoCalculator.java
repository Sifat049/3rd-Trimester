package GUI.Practice;

import javax.swing.*;
import java.awt.*;

public class DemoCalculator  {
    public static void main(String[] args) {
        JFrame frame= new JFrame("Calculator");
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create Panel
        JPanel panelup=new JPanel();
        panelup.setBackground(Color.MAGENTA);
        JPanel paneldown=new JPanel();
        paneldown.setBackground(Color.YELLOW);

        //create label & TextField
        JLabel label=new JLabel("Label1 ");
        JTextField textField=new JTextField(20);



        //creating Button
        JButton button1=new JButton("Button 1");
        button1.setForeground(Color.cyan);
        JButton button2=new JButton("Button 2");
        JButton button3=new JButton("Button 3");

        //Adding at panel
        panelup.add(label);
        panelup.add(textField);
        paneldown.add(button1);
        paneldown.add(button2);
        paneldown.add(button3);

        button2.setBounds(67,77,88,99);

        //Set Layout
        frame.setLayout(new FlowLayout());

        //panel Add in Frame
        frame.add(panelup);
        frame.add(paneldown);

        
        frame.setBackground(Color.ORANGE);
        frame.setVisible(true);
    }
}
