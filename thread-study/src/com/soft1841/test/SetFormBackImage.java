package com.soft1841.test;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetFormBackImage extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        SetFormBackImage frame = new SetFormBackImage();
        frame.setVisible(true);
    }

    public SetFormBackImage() {
        setTitle("实现带背景定图片的窗体");// 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);// 设置窗体位置
        contentPane = new JPanel();// 创建内容面板
        setContentPane(contentPane);// 设置窗体内容面板
        contentPane.setLayout(new BorderLayout(0, 0));
        BackgroundPanel backgroundPanel = new BackgroundPanel();// 创建背景面板
        backgroundPanel.setImage(getToolkit().getImage(getClass().getResource("/img/Penguins.jpg")));// 设置面板背景图片
        contentPane.add(backgroundPanel);// 把背景面板添加到窗体内容面板
    }
}

