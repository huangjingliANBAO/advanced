package com.soft1841.bookdemo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * 模拟红绿灯变化场景窗体程序
 * @author 黄敬理
 * 2019.04.09
 */
public class TraficLights extends JFrame {
    private JPanel contenPanel;
    private JPanel bgPanel;
    private JLabel bgLabel;

    public TraficLights(){
        init();
        setTitle("模拟红绿灯变化场景");
        setLocationRelativeTo(null);//窗体自动居中
        setSize(100,320);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        //内容面板
       contenPanel = new JPanel();
       contenPanel.setBackground(Color.LIGHT_GRAY);
       contenPanel.setBorder(new EmptyBorder(5,5,5,5));
       contenPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
       setContentPane(contenPanel);
       //图片面板
        bgPanel = new JPanel();
        bgPanel.setBackground(Color.white);
        bgPanel.setBorder(new TitledBorder(null,"交通灯",TitledBorder.LEADING,TitledBorder.TOP,null,null));
        contenPanel.add(bgPanel);
        bgPanel.setLayout(new BorderLayout(0,0));
        //标签
        bgLabel = new JLabel();
        bgLabel.setBackground(Color.GREEN);
        bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/img/Green.png")));
        bgPanel.add(bgLabel,BorderLayout.CENTER);

        TurnColor tc = new TurnColor();
        tc.setBgLabel(bgLabel);
        tc.start();
    }

    public static void main(String[] args) {
        TraficLights frame = new TraficLights();
        frame.setVisible(true);
    }
}
