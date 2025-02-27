package Layout;

import javax.swing.*;
import java.awt.*;

public class LayOut {
    public static void main(String[] args) {

        JFrame frame = new JFrame("LAYOUT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panelBottom = new JPanel();

        //Align FlowLayout
        // FlowLayout layout=new FlowLayout(FlowLayout.LEFT);//start left//LEFT/RIGHT/CENTER/LEADING/
        //FlowLayout layout1=new FlowLayout(FlowLayout.RIGHT);//start right

        // panelBottom.setLayout(layout);
        // panelBottom.setLayout(layout1);
        panelBottom.setLayout(new FlowLayout(FlowLayout.CENTER));//Direct align

        //BUTTON
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");

        panelBottom.add(button1);
        panelBottom.add(button2);
        panelBottom.add(button3);

        frame.add(panelBottom);

        frame.setVisible(true);

    }
}
