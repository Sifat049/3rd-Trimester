
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
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.ROMAN_BASELINE, 20);

    double num1 = 0, num2 = 0, result = 0;
    char operator;
    boolean operatorPressed = false;
    boolean isResultDisplayed = false;
    boolean equalPressed = false;
    boolean isCalculatorOn = true;

    Abacus() {
        frame = new JFrame("ABACUS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(450, 49, 400, 600);
        frame.setResizable(false);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setEditable(false);
        textField.setBackground(Color.BLACK);
        textField.setForeground(Color.WHITE);


        addButton = new JButton("+");
        subButton = new JButton("-");
        multiButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equalButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");


        onButton = new JRadioButton("ON");
        offButton = new JRadioButton("OFF");
        onButton.setSelected(true);

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

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(Color.LIGHT_GRAY);
            functionButtons[i].setForeground(Color.BLACK);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(Color.LIGHT_GRAY);
            numberButtons[i].setForeground(Color.BLACK);
        }

        delButton.setBounds(50, 490, 145, 35);
        clrButton.setBounds(205, 490, 145, 35);


        onButton.setBounds(50, 80, 70, 30);
        offButton.setBounds(130, 80, 70, 30);


        panel = new JPanel();
        panel.setBounds(50, 120, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.GRAY);


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


        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(onButton);
        frame.add(offButton);
        frame.add(textField);
        frame.setVisible(true);


        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toggleCalculator(true);
            }
        });

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int option = JOptionPane.showConfirmDialog(null, "Do You Want to Exit?", "Abacus-0.2", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    toggleCalculator(false);
                }
            }
        });
    }


    private void toggleCalculator(boolean state) {
        isCalculatorOn = state;

        for (JButton button : numberButtons) {
            button.setEnabled(isCalculatorOn);
        }
        for (JButton button : functionButtons) {
            button.setEnabled(isCalculatorOn);
        }
        textField.setText(isCalculatorOn ? textField.getText() : "Calculator is OFF");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (!isCalculatorOn) {
            int response = JOptionPane.showConfirmDialog(frame, "The calculator is OFF. Would you like to turn it ON?", "Calculator Off", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                toggleCalculator(true); // calculator  on
            }
            return;  // Exit
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

        if (e.getSource() == decButton) {
            if (!textField.getText().contains(".")) {
                textField.setText(textField.getText().concat("."));
            }
        } else if (e.getSource() == addButton || e.getSource() == subButton ||
                e.getSource() == multiButton || e.getSource() == divButton) {
            if (!operatorPressed) {
                num1 = Double.parseDouble(textField.getText());
                operator = ((JButton) e.getSource()).getText().charAt(0);
                textField.setText(textField.getText() + " " + operator + " ");
                operatorPressed = true;
            } else {
                // Allow changing the operator before entering the second number
                textField.setText(textField.getText().substring(0, textField.getText().length() - 3) + " " + operator + " ");
                operator = ((JButton) e.getSource()).getText().charAt(0);
            }
        } else if (e.getSource() == equalButton) {
            if (!operatorPressed && !textField.getText().isEmpty()) {
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
                        textField.setText(textField.getText() + " = " + result);
                        num1 = result;
                        isResultDisplayed = true;
                        equalPressed = true;
                    } catch (ArithmeticException ex) {
                        textField.setText("Error: " + ex.getMessage());
                    }
                }
            }
        } else if (e.getSource() == clrButton) {
            textField.setText("");
            num1 = num2 = result = 0;  // Reset all values
            operatorPressed = false; // Reset
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
        Abacus cal = new Abacus();
    }
}
