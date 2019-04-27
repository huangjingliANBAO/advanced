package com.soft1841.timer;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class WriterThread implements Runnable {

    int time = 6000;
    char word;
    int k = 199999;

    @Override
    public void run() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                k=19968;
                while(true)
                {
                    word=(char)k;
                    File file = new File("D:/m.txt");
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
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try{
                        sleep(time);
                    }
                    catch(InterruptedException e){}
                    k++;
                    if(k>=29968) k=19968;
                }
            }
        } ;
        Timer timer = new Timer();
        timer.schedule(task,1000,100);
    }
}
