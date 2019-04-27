package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;

/**
 * 线程学习 绘制彩色线段
 * @author 黄敬理
 * 2019.04.10
 */
public class DrawLineFrame extends JFrame {
    public DrawLineFrame(){
        init();
        setTitle("绘制彩色线段");
        setSize(1220,600);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private void init(){
        getContentPane().setBackground(new Color(87, 201, 185));
        DrawLineThread drawLineThread = new DrawLineThread();
        drawLineThread.setFrame(this);
        new Thread(drawLineThread).start();
    }

    public static void main(String[] args) {
        new DrawLineFrame();
    }

}
