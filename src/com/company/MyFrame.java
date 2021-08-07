package com.company;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    String time;
    JLabel dateLabel;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Nice clock to track the time...");
        this.setLayout(new FlowLayout());
        this.setSize(450, 195);
        this.setResizable(false);
        this.setVisible(true);
        timeFormat = new SimpleDateFormat("kk : mm : ss");
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 80));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        dayFormat = new SimpleDateFormat("dd-MM-yyyy, EEEE :)");
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 35));
        dateLabel.setForeground(new Color(0xFF0000));
        this.add(timeLabel);
        this.add(dateLabel);
        this.setVisible(true);
        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);
            date = dayFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
