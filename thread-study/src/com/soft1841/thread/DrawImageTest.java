package com.soft1841.thread;

import javax.swing.*;
import java.io.*;

public class DrawImageTest extends JFrame {
    private JLabel imgLabel;
    private Icon icon;
public DrawImageTest() throws IOException {
    init();
    setTitle("窗体绘制图片");
    setSize(1000,800);
    setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
private void init() throws IOException {
    //添加标签
    imgLabel = new JLabel();
    add(imgLabel);
    //创建InputStream输入流
    File file = new File("D:/carousel/2.png");
    InputStream in = new FileInputStream(file);
    byte[] bytes = new byte[(int) file.length()];
    in.read(bytes);
    in.close();
    //图片加入图标
    icon = new ImageIcon(bytes);
    imgLabel.setIcon(icon);
}
    public static void main(String[] args) throws IOException {
        new DrawImageTest();
    }
}
