package com.java.util.one.test;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutPosition extends JFrame {
    public FlowLayoutPosition(){
        //设置窗体标题
        setTitle("本窗体使用流布局管理器");
        Container c = getContentPane();
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
        for (int i = 0; i < 10;i++){
            c.add(new JButton("button" + 1));
        }
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new FlowLayoutPosition();
    }
}
