package Experiment10;

import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
    JTextField nameField, emailField;
    JPasswordField passwordField, confirmField;
    JLabel messageLabel;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(350, 300);
        setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 100, 20);
        nameField = new JTextField();
        nameField.setBounds(150, 30, 150, 20);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 60, 100, 20);
        emailField = new JTextField();
        emailField.setBounds(150, 60, 150, 20);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 90, 100, 20);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 90, 150, 20);

        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setBounds(30, 120, 120, 20);
        confirmField = new JPasswordField();
        confirmField.setBounds(150, 120, 150, 20);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(110, 160, 100, 25);

        messageLabel = new JLabel("");
        messageLabel.setBounds(30, 200, 250, 20);

        registerBtn.addActionListener(e -> register());

        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passLabel);
        add(passwordField);
        add(confirmLabel);
        add(confirmField);
        add(registerBtn);
        add(messageLabel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void register() {
        String name = nameField.getText();
        String email = emailField.getText();
        String pass = new String(passwordField.getPassword());
        String confirm = new String(confirmField.getPassword());

        if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
            messageLabel.setText("All fields are required.");
        } else if (!email.contains("@")) {
            messageLabel.setText("Invalid email.");
        } else if (!pass.equals(confirm)) {
            messageLabel.setText("Passwords do not match.");
        } else {
            messageLabel.setText("Registration Successful!");
        }
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
