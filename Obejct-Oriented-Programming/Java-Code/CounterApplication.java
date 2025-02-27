package class_18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApplication implements ActionListener {
    //Declare Components
    JFrame f = new JFrame("Counter");
    JPanel p = new JPanel();
    JLabel l = new JLabel("count:");
    JTextField tf = new JTextField("0");
    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");

    public void launch(){
        //Configure properties
        f.setSize(400,400);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        p.setBackground(new Color(0,255,255));
        p.setLayout(null);
        f.setResizable(false);
        tf.setBounds(150,100,100,20);
        l.setBounds(80,100,100,20);
        b1.setBounds(175,170,50,50);
        b1.addActionListener(this);
        b1.setActionCommand("1");
        l.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,20));
        b2.setBounds(175,240,50,50);
        b2.addActionListener(this);
        b2.setActionCommand("2");

        //Add the components
        f.setContentPane(p);
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(l);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        CounterApplication c = new CounterApplication();
        c.launch();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s == "1"){
            String current = tf.getText();
            int i = Integer.parseInt(current);
            i++;
            tf.setText(String.valueOf(i));

        } else if (s == "2") {
            String current = tf.getText();
            int i = Integer.parseInt(current);
            if(i>0) i--;
            tf.setText(String.valueOf(i));
        }
    }
}
