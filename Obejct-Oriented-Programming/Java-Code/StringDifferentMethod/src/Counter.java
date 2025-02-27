//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class Counter extends JFrame implements ActionListener {
//
//    JFrame frame;
//    JTextField textField;
//    JButton plus;
//    JButton minus;
//    JPanel panel;
//
//    Counter(){
//
//        frame = new JFrame("counter");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setBounds(299,22,424,233);
//        frame.setLayout(null);
//        frame.setResizable(false);
//
//        textField=new JTextField();
//        textField.setEditable(false);
//
//        plus=new JButton("+");
//        minus =new JButton();
//        plus.addActionListener(this);
//        minus.addActionListener(this);
//
//
//        panel=new JPanel();
//
//        panel.add(plus);
//        panel.add(minus);
//        frame.add(panel);
//        frame.add(plus);
//        frame.add(minus);
//        frame.add(textField);
//
//        frame.setVisible(true);
//
//    }
//
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource()==plus){
//            textField.setText(textField.getText());
//        }
//
//    }
//    public static void main(String[] args) {
//      Counter c=new Counter();
//    }
//
//}
//
