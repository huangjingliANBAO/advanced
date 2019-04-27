package com.soft1841.word;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * 集合 io swing 多线程 大作业
 * @author 黄敬理
 * 2019.04.27
 */
public class TencentFrame extends JFrame {
    private JPanel topPanel,centralPanel,buttonPanel;
    private JLabel imagesLabel,filmLabel;

    public TencentFrame(){
        init();
        setTitle("腾讯视频");
        setSize(1408,797);
        setLayout(null);
        setLocationRelativeTo(null);//窗体居中
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        //按钮面板
        buttonPanel = new JPanel(new GridLayout(1,10,10,0));
        buttonPanel.setBounds(100,52,1178,32);
        JButton btn1 = new JButton("电视剧");
        buttonPanel.add(btn1);
        JButton btn2 = new JButton("海外剧");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog1 dialog1 = new MyJDialog1(TencentFrame.this);
                dialog1.setVisible(true);

            }
        });
        buttonPanel.add(btn2);
        JButton btn3 = new JButton("网络剧");
        buttonPanel.add(btn3);
        JButton btn4 = new JButton("年度大剧");
        buttonPanel.add(btn4);
        JButton btn5 = new JButton("口碑好剧");
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog3 dialog3 = new MyDialog3(TencentFrame.this);
                dialog3.setVisible(true);
            }
        });
        buttonPanel.add(btn5);
        JButton btn6 = new JButton("免费热剧");
        buttonPanel.add(btn6);
        JButton btn7 = new JButton("军旅抗战");
        buttonPanel.add(btn7);
        JButton btn8 = new JButton("美国大片");
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyJDialog2 dialog2 = new MyJDialog2(TencentFrame.this);
                dialog2.setVisible(true);
            }
        });
        buttonPanel.add(btn8);
        JButton btn9 = new JButton("都市生活");
        buttonPanel.add(btn9);
        JButton btn10 = new JButton("更多分类");
        buttonPanel.add(btn10);
        add(buttonPanel);

       //电影面板
        filmLabel = new JLabel();
        add(filmLabel);
        centralPanel = new JPanel(new GridLayout(2,6,10,20));
        centralPanel.setBounds(6,425,1386,300);
        add(centralPanel);
        centralPanel.setBorder(BorderFactory.createTitledBorder("精选电视剧"));
        //放入电视剧图片
        JLabel a = new JLabel();
        a.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/1.png")));
        centralPanel.add(a);
        JLabel b = new JLabel();
        b.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/2.png")));
        centralPanel.add(b);
        JLabel c = new JLabel();
        c.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/3.png")));
        centralPanel.add(c);
        JLabel d = new JLabel();
        d.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/4.png")));
        centralPanel.add(d);
        JLabel e = new JLabel();
        e.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/5.png")));
        centralPanel.add(e);
        JLabel f = new JLabel();
        f.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/6.png")));
        centralPanel.add(f);
        JLabel a1= new JLabel();
        a1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/7.png")));
        centralPanel.add(a1);
        JLabel b1 = new JLabel();
        b1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/8.png")));
        centralPanel.add(b1);
        JLabel c1 = new JLabel();
        c1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/9.png")));
        centralPanel.add(c1);
        JLabel d1 = new JLabel();
        d1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/10.png")));
        centralPanel.add(d1);
        JLabel e1 = new JLabel();
        e1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/11.png")));
        centralPanel.add(e1);
        JLabel f1 = new JLabel();
        f1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/12.png")));
        centralPanel.add(f1);

        //轮播面板
        topPanel = new JPanel();
        add(topPanel);
        topPanel.setBounds(185,80,980,310);
        imagesLabel = new JLabel();
        topPanel.add(imagesLabel);
        Carousel carousel = new Carousel();
        carousel.setImagesLabel(imagesLabel);
        Thread thread = new Thread(carousel);
        thread.start();
    }
    public static void main(String[] args) {
        new TencentFrame();
    }
}
class MyJDialog1 extends JDialog{
    public MyJDialog1(TencentFrame frame){
        super(frame,"海外剧",true);
        init2();
        setBounds(300,160,1201,724);
    }
    private void init2(){
        try{
            //中间面板放大电影图
            JLabel  foreignFilm = new JLabel();
            add(foreignFilm);
            JPanel centralPanel = new JPanel();
            //centralPanel.setBounds(98,6,980,304);
            add(centralPanel);
            JLabel a1 = new JLabel();
            a1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/18.png")));
            centralPanel.add(a1);
            //下部电影
            JLabel a2 = new JLabel();
            a2.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/21.png")));
            centralPanel.add(a2);
            JLabel a3 = new JLabel();
            a3.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/22.png")));
            centralPanel.add(a3);
            JLabel a4 = new JLabel();
            a4.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/23.png")));
            centralPanel.add(a4);
            JLabel a5 = new JLabel();
            a5.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/24.png")));
            centralPanel.add(a5);
            JLabel a6 = new JLabel();
            a6.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/25.png")));
            centralPanel.add(a6);
            JLabel a7 = new JLabel();
            a7.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/26.png")));
            centralPanel.add(a7);
            JLabel a8 = new JLabel();
            a8.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/27.png")));
            centralPanel.add(a8);
            JLabel a9 = new JLabel();
            a9.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/28.png")));
            centralPanel.add(a9);
            JLabel a10 = new JLabel();
            a10.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/29.png")));
            centralPanel.add(a10);
            JLabel a11 = new JLabel();
            a11.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/30.png")));
            centralPanel.add(a11);
//
//            JPanel hai = new JPanel();
//            hai.add(hai);
//            hai.setBounds(10,10,980,304);
//            JLabel imagesLabel2 = new JLabel();
//            add(imagesLabel2);
//            imagesLabel2.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/18.png")));
//            hai.add(imagesLabel2);
            //启动轮播线程
//            Carousel2 carousel2 = new Carousel2();
//            carousel2.setImagesLabel2(imagesLabel2);
//            Thread thread2 = new Thread(carousel2);
//            thread2.start();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
class MyJDialog2 extends JDialog{
    public MyJDialog2(TencentFrame frame){
        super(frame,"美国大片",true);
        init3();
        setBounds(300,160,1201,724);
    }
    private void init3(){
//        //中间面板放大电影图
        JLabel  AmericaFilm = new JLabel();
        add(AmericaFilm);
        JPanel largePanel = new JPanel();
        //largePanel.setBounds(100,60,974,309);
        add(largePanel);
        JLabel a1 = new JLabel();
        a1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/31.png")));
        largePanel.add(a1);
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/34.png")));
        largePanel.add(a2);
        //下部电影

    }
}
class MyDialog3 extends JDialog{
    public MyDialog3(TencentFrame frame){
        super(frame,"口碑好剧",true);
        init4();
        setBounds(300,160,1201,724);
    }
    private void init4(){
        JLabel  dramaFilm = new JLabel();
        add(dramaFilm);
        JPanel largePanel = new JPanel();
        //largePanel.setBounds(100,60,974,309);
        add(largePanel);
        //放电影背景图
        JLabel a1 = new JLabel();
        a1.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/32.png")));
        largePanel.add(a1);
        JLabel a2 = new JLabel();
        a2.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/33.png")));
        largePanel.add(a2);
        JLabel a3 = new JLabel();
        a3.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/35.png")));
        largePanel.add(a3);
        JLabel a4 = new JLabel();
        a4.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/36.png")));
        largePanel.add(a4);
        JLabel a5 = new JLabel();
        a5.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/37.png")));
        largePanel.add(a5);
        JLabel a6 = new JLabel();
        a6.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/38.png")));
        largePanel.add(a6);
        JLabel a7 = new JLabel();
        a7.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/39.png")));
        largePanel.add(a7);
        JLabel a8 = new JLabel();
        a8.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/40.png")));
        largePanel.add(a8);
        JLabel a9 = new JLabel();
        a9.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/41.png")));
        largePanel.add(a9);
        JLabel a10 = new JLabel();
        a10.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/42.png")));
        largePanel.add(a10);
        JLabel a11 = new JLabel();
        a11.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/43.png")));
        largePanel.add(a11);
        JLabel a12 = new JLabel();
        a12.setIcon(new ImageIcon(TencentFrame.class.getResource("/img/44.png")));
        largePanel.add(a12);

    }
}