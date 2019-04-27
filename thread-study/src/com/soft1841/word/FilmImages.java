package com.soft1841.word;

import javax.swing.*;
import java.io.*;

public class FilmImages {
    private String[] images = {"D:/image/1.png","D:/image/2.png","D:/image/3.png","D:/image/4.png",
            "D:/image/5.png","D:/image/6.png","D:/image/7.png","D:/image/8.png",
            "D:/image/9.png","D:/image/10.png","D:/image/11.png","D:/image/12.png"};
    private JLabel filmLabel;



    public FilmImages(){
        int i = 0;
        while (true){
            File file = new File(images[i]);
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
            filmLabel.setIcon(icon);
            i++;
            if(i == 12){
                break;
            }
        }
    }
}
