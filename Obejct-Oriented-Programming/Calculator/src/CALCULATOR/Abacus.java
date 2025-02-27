/*package CALCULATOR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abacus extends JFrame implements ActionListener {




    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, multiButton, divButton,
            decButton, equalButton, delButton, clrButton;


    JPanel panel;
    Font myFont = new Font("Ink Free", Font.ROMAN_BASELINE, 20);

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    // String num1,num2,result,operator;


    // private  ImageIcon icon = new ImageIcon(getClass().getResource(""));
    // this.setIconImage(icon.getImage());

    Abacus() {


        frame = new JFrame("ABACUS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 49, 450, 560);
        frame.setResizable(false);
        frame.setLayout(null);
//        ImageIcon icon = new ImageIcon(getClass().getResource("cal.png"));
//        this.setIconImage(icon.getImage());

        // num1=num2=result="";

        // TEXTFIELD
        textField = new JTextField();
        textField.setBounds(75, 25, 270, 50);
        textField.setEditable(false);

//ADD BUTTON
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("clear");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);

        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);

        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        //Panel
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
//        panel.setBackground(Color.GRAY);
//
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divButton);


//        JOptionPane.showInputDialog(null,"Enter Your Problem","Problem",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"WELCOME TO MY ABACUS","Calculator",JOptionPane.PLAIN_MESSAGE);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
        initCompo();
    }

    public void initCompo() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));
        }
        else  if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        else if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        else if (e.getSource() == multiButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        else if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equalButton) {
            num1 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num2 = result;
        }

        if (e.getSource() == clrButton) {
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }



    
    }

    public static void main(String[] args) {

        Abacus cal = new Abacus();
        //EXIT
//        int option = JOptionPane.showConfirmDialog(null,"Do You Want to Exit","Calculator",JOptionPane.YES_NO_OPTION);
//            if (option == JOptionPane.YES_OPTION){
//                System.exit(0);
//            }
//            else {
//                System.out.println("YOU HAVE CLICKED NO OPTION");
//        }
    }


}

*/


package CALCULATOR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Abacus extends JFrame implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, multiButton, divButton, decButton, equalButton, delButton, clrButton;
    JRadioButton onButton, offButton;
    ButtonGroup buttonGroup;
    JPanel panel; // Standard JPanel for black background
    Font myFont = new Font("Ink Free", Font.BOLD, 20);

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    boolean operatorPressed = false;
    boolean isResultDisplayed = false;
    boolean equalPressed = false;
    boolean isCalculatorOn = true;

    Abacus() {
        frame = new JFrame("ABACUS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 49, 400, 600); // Adjusted frame size for better visibility
        frame.setResizable(true);
        frame.setLayout(null);

        // Dark gray display (textField)
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        textField.setBackground(new Color(30, 30, 30)); // Set to dark gray background
        textField.setForeground(Color.WHITE); // White text color
        textField.setFont(myFont);

        // Create function buttons with subtle deep colors
        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        // Create ON/OFF radio buttons
        onButton = new JRadioButton("ON");
        offButton = new JRadioButton("OFF");
        onButton.setSelected(true); // Default ON

        buttonGroup = new ButtonGroup();
        buttonGroup.add(onButton);
        buttonGroup.add(offButton);

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = multiButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equalButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        // Use deep colors for function buttons
        Color[] functionColors = {
                new Color(50, 50, 50),  // Dark gray for "+"
                new Color(50, 50, 50),  // Dark gray for "-"
                new Color(50, 50, 50),  // Dark gray for "*"
                new Color(50, 50, 50),  // Dark gray for "/"
                new Color(40, 40, 40),  // Slightly darker for "."
                new Color(40, 40, 40),  // Slightly darker for "="
                new Color(60, 60, 60),  // Dark maroon for "Delete"
                new Color(60, 60, 60)   // Dark maroon for "Clear"
        };

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(functionColors[i]); // Apply deep color backgrounds
            functionButtons[i].setForeground(Color.WHITE); // White text for good contrast
            addHoverEffect(functionButtons[i], functionColors[i], functionColors[i].brighter()); // Slightly lighter hover effect
        }

        // Customize number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(50, 50, 50)); // Deep gray for number buttons
            numberButtons[i].setForeground(Color.WHITE); // White text
            addHoverEffect(numberButtons[i], new Color(50, 50, 50), new Color(70, 70, 70)); // Hover effect to lighter gray
        }

        // Set radio buttons bounds
        onButton.setBounds(50, 80, 70, 30);
        offButton.setBounds(130, 80, 70, 30);

        // Set function buttons for clear and delete
        delButton.setBounds(50, 490, 145, 50);
        clrButton.setBounds(205, 490, 145, 50);

        // Black background for number and function buttons panel
        panel = new JPanel();
        panel.setBounds(50, 120, 300, 360); // Adjusted panel size
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(30, 30, 30)); // Full dark gray background

        // Add number buttons and function buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(multiButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(divButton);

        // Add components to the frame
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(onButton);
        frame.add(offButton);
        frame.add(textField);
        frame.setVisible(true);

        // Add action listeners for ON/OFF buttons
        onButton.addActionListener(e -> toggleCalculator(true));
        offButton.addActionListener(e -> {
            int option = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Calculator", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                toggleCalculator(false);
            }
        });
    }

    // Method to toggle calculator state
    private void toggleCalculator(boolean state) {
        isCalculatorOn = state;
        for (JButton button : numberButtons) {
            button.setEnabled(isCalculatorOn);
        }
        for (JButton button : functionButtons) {
            button.setEnabled(isCalculatorOn);
        }
        textField.setText(isCalculatorOn ? "" : "Calculator is OFF");
    }

    // Hover effect for buttons
    private void addHoverEffect(JButton button, Color originalColor, Color hoverColor) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(hoverColor);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(originalColor);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!isCalculatorOn) {
            int response = JOptionPane.showConfirmDialog(frame, "The calculator is OFF. Turn it ON?", "Calculator Off", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                toggleCalculator(true);
            }
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                if (isResultDisplayed || equalPressed) {
                    textField.setText("");
                    isResultDisplayed = false;
                    equalPressed = false;
                }
                textField.setText(textField.getText().concat(String.valueOf(i)));
                operatorPressed = false;
            }
        }

        if (e.getSource() == decButton && !textField.getText().contains(".")) {
            textField.setText(textField.getText().concat("."));
        } else if (e.getSource() == addButton || e.getSource() == subButton ||
                e.getSource() == multiButton || e.getSource() == divButton) {
            if (!operatorPressed) {
                num1 = Double.parseDouble(textField.getText());
                operator = ((JButton) e.getSource()).getText().charAt(0);
                textField.setText(textField.getText() + " " + operator + " ");
                operatorPressed = true;
                equalPressed = false;
            }
        } else if (e.getSource() == equalButton) {
            String[] parts = textField.getText().split(" ");
            if (parts.length == 3) {
                num2 = Double.parseDouble(parts[2]);
                try {
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 == 0) throw new ArithmeticException("Cannot divide by zero");
                            result = num1 / num2;
                            break;
                    }
                    textField.setText(String.valueOf(result));
                    num1 = result; // Store result for further calculations
                    isResultDisplayed = true; // Flag result displayed
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        } else if (e.getSource() == clrButton) {
            textField.setText("");
            num1 = num2 = result = 0; // Reset all values
            operatorPressed = false; // Reset operator pressed state
            isResultDisplayed = false;
            equalPressed = false;
        } else if (e.getSource() == delButton) {
            String string = textField.getText();
            if (string.length() > 0 && !isResultDisplayed) {
                textField.setText(string.substring(0, string.length() - 1));
            }
        }
    }

    public static void main(String[] args) {
        new Abacus();
    }
}
