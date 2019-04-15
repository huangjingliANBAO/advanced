package week1.com.soft1841.bookdemo;

import javax.swing.*;

/**
 * 模拟大巴车出发 使用线程的join（）方法
 * @author 黄敬理
 * 2019.04.11
 */
public class BuysThreadTest implements Runnable {
    private JTextArea jTextArea;

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    public static void main(String[] args) {
        BuysThreadTest bt = new BuysThreadTest();
        Thread thread = new Thread(bt);
        thread.start();
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("旅游淡季：" + i + "号车出发！");
        }
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("旅游旺季：" + i + "号车出发！");
        }
    }
}
