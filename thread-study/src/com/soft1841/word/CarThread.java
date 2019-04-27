package com.soft1841.word;

import javax.swing.*;

public class CarThread implements Runnable {
    private JLabel carLavel;

    public void setCarLavel(JLabel carLavel) {
        this.carLavel = carLavel;
    }

    @Override
    public void run() {
       int x = 0;
       while (x <= 1920){
           //汽车开始坐标
           carLavel.setLocation(x,300);
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           x += 50;
           if (x >= 1920){
               x = 10;
           }
       }
    }
}
