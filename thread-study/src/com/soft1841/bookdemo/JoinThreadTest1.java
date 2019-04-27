package com.soft1841.bookdemo;

import javax.swing.*;

/**
 * 进度条的滚动
 * @author 黄敬理
 * 2019.04.11
 */
public class JoinThreadTest1 implements Runnable {
    private JProgressBar jProgressBar1;

    public void setjProgressBar1(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }
    @Override
    public void run() {
       int count = 0;
       while (true){
           jProgressBar1.setValue(++count);
           try {
               Thread.sleep(100);
               if (count == 80){
                  break;
               }
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }

}



