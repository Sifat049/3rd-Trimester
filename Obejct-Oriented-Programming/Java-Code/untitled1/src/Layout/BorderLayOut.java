package Layout;

import javax.swing.*;
import java.awt.*;

public class BorderLayOut {

    public static void main(String[] args) {
        JFrame frame=new JFrame("BORDER LAYOUT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,450);

        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        JButton button5 = new JButton("Button5");



        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button5, BorderLayout.CENTER);
        frame.add(button4, BorderLayout.EAST);
        frame.add(button3, BorderLayout.WEST);


        frame.setVisible(true);
    }
}
