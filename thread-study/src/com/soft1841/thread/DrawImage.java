package com.soft1841.thread;

import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中绘制图片
 * @author 黄敬理
 * 2019.04.11
 */
public class DrawImage extends JFrame {
    public DrawImage(){
        this.setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("绘制图像");
    }
    //创建Canvas（）方法
    private class CanvasTest extends Component {
        public void  paint(Graphics g){
            super.paint(g);
            Graphics2D graphics2D = (Graphics2D)g;
            //获取图片
            Image img = new ImageIcon(this.getClass().getResource("/img/1.png")).getImage();
            graphics2D.drawImage(img,0,0,this);
        }
        }
        public static void main(String[] args) {
            new DrawImage();
    }
}
