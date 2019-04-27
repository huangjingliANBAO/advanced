package com.soft1841.test;


import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RoadMap extends JFrame { // 创建一个“路况图”类，并继承JFrame
    // 声明窗体中的组件
    private JPanel contentPane;
    /**
     * 主方法
     */
    public static void main(String[] args) {
        RoadMap frame = new RoadMap(); // 创建RoadMap对象
        frame.setVisible(true); // 使frame可视
    }
    /**
     * 创建JFrame窗体
     */
    public RoadMap() { // RoadMap的构造方法
        setResizable(false); // 不可改变窗体大小
        setTitle("十字路口四个方向的车况截图"); // 设置窗体题目
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗体关闭的方式
        setBounds(100, 100, 561, 404); // 设置窗体大小
        /**
         * 创建JPanel面板contentPane置于JFrame窗体中，并设置面板的边距和布局
         */
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(2, 2, 0, 0));
        /**
         * 创建JPanel面板panelNorth置于面板contentPane中，并设置面板panelNorth的布局
         */
        JPanel panelNorth = new JPanel();
        contentPane.add(panelNorth);
        panelNorth.setLayout(new BorderLayout(0, 0));
        /**
         * 创建标签labelNorth置于面板panelNorth的中间，并为标签添加图标
         */
        JLabel labelNorth = new JLabel("");
        labelNorth.setIcon(new ImageIcon(RoadMap.class.getResource("/img2/1.png")));
        panelNorth.add(labelNorth, BorderLayout.CENTER);
        /**
         * 创建标签labelNImage置于面板panelNorth的南侧，设置标签labelNImage的text值与text在标签中的位置
         */
        JLabel labelNImage = new JLabel("北侧路口");
        labelNImage.setHorizontalAlignment(SwingConstants.CENTER);
        panelNorth.add(labelNImage, BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelSouth置于面板contentPane中，并设置面板panelSouth的布局
         */
        JPanel panelSouth = new JPanel();
        contentPane.add(panelSouth);
        panelSouth.setLayout(new BorderLayout(0, 0));
        /**
         * 创建标签labelSouth置于面板panelSouth的中间，并为标签添加图标
         */
        JLabel labelSouth = new JLabel("");
        labelSouth.setIcon(new ImageIcon(RoadMap.class.getResource("/img2/2.png")));
        panelSouth.add(labelSouth, BorderLayout.CENTER);
        /**
         * 创建标签labelSImage置于面板panelSouth的南侧，设置标签labelSImage的text值与text在标签中的位置
         */
        JLabel labelSImage = new JLabel("南侧路口");
        labelSImage.setHorizontalAlignment(SwingConstants.CENTER);
        panelSouth.add(labelSImage, BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelWest置于面板contentPane中，并设置面板panelWest的布局
         */
        JPanel panelWest = new JPanel();
        contentPane.add(panelWest);
        panelWest.setLayout(new BorderLayout(0, 0));
        /**
         * 创建标签labelWest置于面板panelWest的中间，并为标签添加图标
         */
        JLabel labelWest = new JLabel("");
        labelWest.setIcon(new ImageIcon(RoadMap.class.getResource("/img2/3.png")));
        panelWest.add(labelWest, BorderLayout.CENTER);
        /**
         * 创建标签labelWImage置于面板panelWest的南侧，设置标签labelWImage的text值与text在标签中的位置
         */
        JLabel labelWImage = new JLabel("西侧路口");
        labelWImage.setHorizontalAlignment(SwingConstants.CENTER);
        panelWest.add(labelWImage, BorderLayout.SOUTH);
        /**
         * 创建JPanel面板panelEast置于面板contentPane中，并设置面板panelEast的布局
         */
        JPanel panelEast = new JPanel();
        contentPane.add(panelEast);
        panelEast.setLayout(new BorderLayout(0, 0));
        /**
         * 创建标签labelEast置于面板panelEast的中间，并为标签添加图标
         */
        JLabel labelEast = new JLabel("");
        labelEast.setIcon(new ImageIcon(RoadMap.class.getResource("/img2/4.png")));
        panelEast.add(labelEast, BorderLayout.CENTER);
        /**
         * 创建标签labelEImage置于面板panelEast的南侧，设置标签labelEImage的text值与text在标签中的位置
         */
        JLabel labelEImage = new JLabel("东侧路口");
        labelEImage.setHorizontalAlignment(SwingConstants.CENTER);
        panelEast.add(labelEImage, BorderLayout.SOUTH);
    }
}
