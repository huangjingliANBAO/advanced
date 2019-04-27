package com.soft1841.word;

import javax.swing.*;
import java.io.*;

public class Carousel2 implements Runnable {
    private String[] images2 = {"D:/image/17.png","D:/image/18.png","D:/image/19.png","D:/image/20.png"};
    private JLabel imagesLabel2;

    public void setImagesLabel2(JLabel imagesLabel2) {
        this.imagesLabel2 = imagesLabel2;
    }
    @Override
    public void run() {
        int i = 0;
        int len = images2.length;
        while (true){
            File file = new File(images2[i]);
            InputStream in = null;
            try {
                in = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            byte[] bytes = new byte[(int) file.length()];
            try {
                in.read(bytes);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Icon icon = new ImageIcon(bytes);
            imagesLabel2.setIcon(icon);
            i++;
            if (i == len){
                i = 0;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
