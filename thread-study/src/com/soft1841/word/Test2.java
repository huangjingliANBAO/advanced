package com.soft1841.word;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Test2 extends JFrame{
    private JPanel contentPane;

    public Test2() {
        setBg();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 710);
        init();
    }

    public static void main(String[] args) {
        new Test2();
    }

    public void init() {
        contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        this.setVisible(true);
    }

    public void setBg(){
        ((JPanel)this.getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon
                ("D:\\image\\1.png");
        JLabel background = new JLabel(img);
        this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    }

}
