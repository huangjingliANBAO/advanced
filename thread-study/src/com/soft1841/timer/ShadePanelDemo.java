package com.soft1841.timer;

import javax.swing.*;
import java.awt.*;

public class ShadePanelDemo extends JPanel {
    /**
     * 构造方法
     */
    public ShadePanelDemo() {
        super();
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g1) {// 重写绘制组件外观
        Graphics2D g = (Graphics2D) g1;
        super.paintComponent(g);// 执行超类方法
        int width = getWidth();// 获取组件大小
        int height = getHeight();
        // 创建填充模式对象
        GradientPaint paint = new GradientPaint(0, 0, Color.CYAN, 0, height,
                Color.MAGENTA);
        g.setPaint(paint);// 设置绘图对象的填充模式
        g.fillRect(0, 0, width, height);// 绘制矩形填充控件界面
    }
}

