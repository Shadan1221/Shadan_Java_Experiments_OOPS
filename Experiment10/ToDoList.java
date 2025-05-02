package Experiment10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoList extends JFrame {
    DefaultListModel<String> listModel;
    JList<String> taskList;
    JTextField taskField;

    public ToDoList() {
        setTitle("To-Do List");
        setSize(400, 300);
        setLayout(new BorderLayout());

        listModel = new DefaultListModel<>();
        taskList = new JList<>(listModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel();
        taskField = new JTextField(20);
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        inputPanel.add(taskField);
        inputPanel.add(addBtn);
        inputPanel.add(removeBtn);

        add(inputPanel, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int selectedIndex = taskList.getSelectedIndex();
            if (selectedIndex != -1) {
                listModel.remove(selectedIndex);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ToDoList();
    }
}
