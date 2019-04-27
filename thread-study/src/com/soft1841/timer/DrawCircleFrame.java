package com.soft1841.timer;

import javax.swing.*;
import java.awt.*;

public class DrawCircleFrame extends JFrame {
    private JTextArea textArea;
    private JScrollPane scrollPane;

    public DrawCircleFrame(){
        init();
        setTitle("绘制随机大小同心圆");
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        textArea = new JTextArea();
        textArea.setSize(500,600);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);

        add(scrollPane, BorderLayout.EAST);
        scrollPane.setBounds(0,0,500,600);

        DrawCircleThread dt = new DrawCircleThread();
        dt.setjFrame(this);
        Thread thread1 = new Thread(dt);
        thread1.start();

        TxtThread t = new TxtThread();
        t.setTextArea(textArea);
        Thread thread2 = new Thread(t);
        thread2.start();

    }
    public static void main(String[] args) {
        new DrawCircleFrame();
    }
}


