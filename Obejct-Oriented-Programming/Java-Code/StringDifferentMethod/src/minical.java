import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class minical implements ActionListener {

    JFrame frame;
    JTextField output;
    JButton plus;
    JButton minus;

    minical() {
        frame = new JFrame("Counter");
        output = new JTextField("0");
        plus = new JButton("+");
        minus = new JButton("-");

        frame.setBounds(100, 100, 400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        output.setBounds(150, 100, 100, 50);
        plus.setBounds(50, 200, 100, 50);
        minus.setBounds(200, 200, 100, 50);

        plus.addActionListener(this);
        minus.addActionListener(this);

        frame.add(output);
        frame.add(plus);
        frame.add(minus);
    }

    public void actionPerformed(ActionEvent e) {
        String s = output.getText();
        int value = Integer.parseInt(s);  //Convert string to integer

        if (e.getSource() == plus) {
            value+=5;
            output.setText(value + ""); //Convert integer to string
        } else if (e.getSource() == minus) {
            value--;
            output.setText(value + "");
        }
    }


    public static void main(String[] args) {
        new minical();
    }
}
