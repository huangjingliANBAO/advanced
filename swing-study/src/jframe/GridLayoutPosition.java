package jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 网格布局管理器
 * @author 黄敬理
 * 2019.03.26
 */
public class GridLayoutPosition extends JFrame {
    private GridLayoutPosition(){
        init();
        setTitle("窗体标题");
        setSize(400,300);
        //窗体居中
        setLocationRelativeTo(null);
        //设置窗体可见
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        Container container = getContentPane();
        /**
         * 设置容器使用网格布局，设置7行3列的网格
         * 组件水平间距5个像素，垂直间距5个像素
         */
        setLayout(new GridLayout(7,3,5,5));
        for (int i = 0; i < 20; i++){
            container.add(new JButton("button" + i));
        }
    }
    public static void main(String[] args) {
        new GridLayoutPosition();
    }
}
