package com.soft1841.bookdemo;

import javax.swing.*;

public class BuysFrame extends JFrame {
    private JTextArea jTextArea;
    public BuysFrame(){
      init();
      setTitle("大巴车旅游出行");
      setSize(500,400);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        jTextArea = new JTextArea();
        add(jTextArea);
        BuysThreadTest bt = new BuysThreadTest();
        Thread thread = new Thread(bt);
        bt.setjTextArea(jTextArea);
        thread.start();
    }
    public static void main(String[] args) {
        new BuysFrame();
    }
}
