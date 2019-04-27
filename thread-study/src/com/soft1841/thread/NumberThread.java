package com.soft1841.thread;

import javax.swing.*;

/**
 * 线程的暂停和恢复
 * @author 黄敬理
 *2019.04.12
 */
public class NumberThread implements Runnable {
    private JLabel numLabel;

    public void setNumLabel(JLabel numLabel) {
        this.numLabel = numLabel;
    }

    private final Object lock =  new Object();
    private boolean pause = false;
    /**
     * 调用该方法实现线程的暂停
     */
    void pauseThread(){
        pause = true;
    }
    /**
     * 调用该方法恢复线程的进行
     */
    void  resumeThread(){
        pause = false;
        synchronized (lock){
            lock.notify();
        }
    }
    /**
     * 这个方法只能在run方法中实现，不然会阻塞主线程，导致页面无响应
     */
    void onPause(){
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void run() {
        int index = 0;
        while (true){
            while (pause){
                onPause();
            }
            try {
                numLabel.setText(String.valueOf(index));
                Thread.sleep(500);
                ++index;
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
