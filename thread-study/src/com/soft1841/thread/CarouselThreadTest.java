package com.soft1841.thread;

import javax.swing.*;
import java.io.*;

/**
 * 线程 窗体图片轮播
 * @author 黄敬理
 * 2019.04.09
 */
public class CarouselThreadTest implements Runnable {
   private String[] images = {"D:/carousel/1.jpg","D:/carousel/2.jpg","D:/carousel/3.jpg","D:/carousel/1.png","D:/carousel/2.png","D:/carousel/3.png"};
   private JLabel imageLabel;
//传setImageLabel()方法到CarouselFream类
    public void setImageLabel(JLabel imageLabel) {
        this.imageLabel = imageLabel;
    }
    @Override
    public void run() {
        int i = 0;
        int len = images.length;
        while (true){
    try {
        File file = new File(images[i]);
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        in.read(bytes);
        Icon icon = new ImageIcon(bytes);
        imageLabel.setIcon(icon);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        i++;
        if (i == len){
            i = 0;
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    }
}
