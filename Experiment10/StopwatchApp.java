package Experiment10;

import javax.swing.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame {
    private int elapsedTime = 0;
    private Timer timer;
    private JLabel timeLabel;
    private JButton startBtn, stopBtn, resetBtn;

    public StopwatchApp() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setLayout(null);

        timeLabel = new JLabel("0 seconds");
        timeLabel.setBounds(100, 30, 150, 30);
        add(timeLabel);

        startBtn = new JButton("Start");
        startBtn.setBounds(30, 80, 70, 30);
        stopBtn = new JButton("Stop");
        stopBtn.setBounds(110, 80, 70, 30);
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(190, 80, 70, 30);

        add(startBtn);
        add(stopBtn);
        add(resetBtn);

        timer = new Timer(1000, e -> {
            elapsedTime++;
            timeLabel.setText(elapsedTime + " seconds");
        });

        startBtn.addActionListener(e -> timer.start());
        stopBtn.addActionListener(e -> timer.stop());
        resetBtn.addActionListener(e -> {
            timer.stop();
            elapsedTime = 0;
            timeLabel.setText("0 seconds");
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}
