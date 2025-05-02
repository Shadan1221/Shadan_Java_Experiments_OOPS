package Experiment10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame {
    JTextField display;
    double num1 = 0, num2 = 0, result = 0;
    String operator = "";

    public SimpleCalculator() {
        setTitle("Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        display = new JTextField();
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(new CalcListener());
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    class CalcListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();
            if (cmd.matches("\\d")) {
                display.setText(display.getText() + cmd);
            } else if (cmd.matches("[+\\-*/]")) {
                num1 = Double.parseDouble(display.getText());
                operator = cmd;
                display.setText("");
            } else if (cmd.equals("=")) {
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/": result = num1 / num2; break;
                }
                display.setText(String.valueOf(result));
            } else if (cmd.equals("C")) {
                display.setText("");
                num1 = num2 = result = 0;
                operator = "";
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
