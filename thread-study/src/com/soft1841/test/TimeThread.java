package com.soft1841.test;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeThread implements Runnable {
    private JLabel timeLabel;

    public void setTimeLabel(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        while(true){
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            timeLabel.setText(String.valueOf(format.format(new Date())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
