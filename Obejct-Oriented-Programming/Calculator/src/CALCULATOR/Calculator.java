package CALCULATOR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    // Components for the calculator
    private JTextField display;
    private JButton[] numberButtons = new JButton[10];
    private JButton addButton, subButton, mulButton, divButton, equalsButton, clearButton;
    private JPanel buttonPanel;

    // Variables to store operands and operator
    private int firstOperand = 0, secondOperand = 0;
    private char operator = ' ';
    private boolean isOperatorPressed = false, isResultDisplayed = false;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Panel to hold buttons
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Create number buttons and add them to the panel
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        // Create operator buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");

        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Equals and clear buttons
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add operator and utility buttons to the panel
        buttonPanel.add(addButton);
        buttonPanel.add(subButton);
        buttonPanel.add(mulButton);
        buttonPanel.add(divButton);
        buttonPanel.add(equalsButton);
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle number buttons
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                if (isResultDisplayed) {
                    display.setText("");
                    isResultDisplayed = false;
                }
                display.setText(display.getText() + i);
            }
        }

        // Handle operator buttons
        if (e.getSource() == addButton || e.getSource() == subButton || e.getSource() == mulButton || e.getSource() == divButton) {
            if (!isOperatorPressed && !display.getText().isEmpty()) {
                firstOperand = Integer.parseInt(display.getText());
                operator = ((JButton) e.getSource()).getText().charAt(0);
                display.setText("");
                isOperatorPressed = true;
            }
        }

        // Handle equals button
        if (e.getSource() == equalsButton && isOperatorPressed) {
            if (!display.getText().isEmpty()) {
                secondOperand = Integer.parseInt(display.getText());

                int result = 0;
                switch (operator) {
                    case '+':
                        result = firstOperand + secondOperand;
                        break;
                    case '-':
                        result = firstOperand - secondOperand;
                        break;
                    case '*':
                        result = firstOperand * secondOperand;
                        break;
                    case '/':
                        if (secondOperand == 0) {
                            display.setText("Error: Divide by 0");
                            return;
                        }
                        result = firstOperand / secondOperand;
                        break;
                }
                display.setText(String.valueOf(result));
                isResultDisplayed = true;
                isOperatorPressed = false;
            }
        }

        // Handle clear button
        if (e.getSource() == clearButton) {
            display.setText("");
            firstOperand = 0;
            secondOperand = 0;
            operator = ' ';
            isOperatorPressed = false;
            isResultDisplayed = false;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
