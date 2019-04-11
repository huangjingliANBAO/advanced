package week1.com.soft1841.bookdemo;

import javax.swing.*;

/**
 * 进度条的滚动
 * @author 黄敬理
 * 2019.04.11
 */
public class JoinThreadTest2 implements Runnable {
    private JProgressBar jProgressBar2;
    public void setjProgressBar2(JProgressBar jProgressBar2) {
        this.jProgressBar2 = jProgressBar2;
    }
    @Override
    public void run() {
        int count = 0;
        while (true){
            jProgressBar2.setValue(++count);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 100){
                break;
            }
        }
    }
}

