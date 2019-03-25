package jframe;

import javax.swing.*;
import java.awt.*;

public class BorderLay extends JFrame {
    public BorderLay(){
        setTitle("这个窗体使用边界布局管理器");
        //定义一个容器
        Container c = getContentPane();
        //设置容器为边界布局管理器
        setLayout(new BorderLayout());
        JButton   centerBtn = new JButton("中神通");
        JButton   northBtn = new JButton("北乞");
        JButton   southBtn = new JButton("南帝");
        JButton   westBtn = new JButton("西毒");
        JButton   eastBtn = new JButton("东邪");
        c.add(centerBtn,BorderLayout.CENTER); //中部添加按钮
        c.add(northBtn,BorderLayout.NORTH);//北部添加按钮
        c.add(southBtn,BorderLayout.SOUTH);//南部添加按钮
        c.add(westBtn,BorderLayout.WEST);//西部添加按钮
        c.add(eastBtn,BorderLayout.EAST);//东部添加按钮
        //设置窗体大小
        setSize(350,200);
        //设置窗体可见
        setVisible(true);
        //设置窗体关闭方式
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        new BorderLay();
    }
}
