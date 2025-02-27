////
////interface  Inf1{
////    void m1();
////    void  m2();
////}
////interface  Inf2{
////    void m3();
////}
////abstract class Abs{
////    abstract void m4();
////}
////class Concrete extends Abs implements Inf1,Inf2 {
////
////    @Override
////    void m4() {
////
////    }
////
////    @Override
////    public void m1() {
////
////    }
////
////    @Override
////    public void m2() {
////
////    }
////
////    @Override
////    public void m3() {
////
////    }
////}
////public class Main {
////    public static void main(String[] args) {
////        System.out.println("Hello world!");
////    }
////}
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
// class CountdownApp {
//    private static int countdown = 3; // Starting point for the countdown
//
//    public static void main(String[] args) {
//        // Create a JFrame
//        JFrame frame = new JFrame("Countdown Timer");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 200); // Set the size of the frame
//        frame.setLayout(null); // Use no layout manager
//
//        // Create a JLabel to display countdown
//        JLabel label = new JLabel("");
//        label.setBounds(100, 50, 100, 30); // Set position and size
//        frame.add(label); // Add label to the frame
//
//        // Create a JButton to start countdown
//        JButton button = new JButton("Start Countdown");
//        button.setBounds(70, 100, 160, 30); // Set position and size
//        frame.add(button); // Add button to the frame
//
//        // Add ActionListener to the button
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Check countdown value and update label accordingly
//                if (countdown > 0) {
//                    label.setText(countdown + "...");
//                    countdown--; // Decrement countdown
//                } else {
//                    label.setText("GO!");
//                    button.setEnabled(false); // Disable the button after "GO!"
//                }
//            }
//        });
//
//        // Make the frame visible
//        frame.setVisible(true);
//    }
//}
public class Main {
    public static void main(String[] args) {
        int a[] = new int[3];  // Array of size 3
        int c = 10, d = 2;
        for (int i = 4; i >= 0; i--) {  // Loop from 4 to 0
            if (i == 2) d = 0;
            try {


                a[i] = c / d;  // Try to assign value to a[i]
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("a");  // Print "a" if ArrayIndexOutOfBoundsException
            }
            catch (ArithmeticException e) {
                System.out.println("b");  // Print "b" if ArithmeticException (like divide by zero)
            }
        }
    }
}