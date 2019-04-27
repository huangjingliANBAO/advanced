package com.soft1841.word;


import java.applet.AudioClip;
import java.io.*;
import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

public class Test {
    public static void main(String args[]) {
        playMusic();
    }
    static void playMusic(){//背景音乐播放
        try {
            URL cb;
            File f = new File("E:\\music\\1.wav"); // 引号里面的是音乐文件所在的路径
            cb = f.toURL();
            AudioClip aau;
            aau = Applet.newAudioClip(cb);
            /**
             * aau.play()循环播放
             * aau.stop()单曲播放后停止
             */
            aau.play();
            aau.loop();//循环播放
            System.out.println("可以播放");


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
