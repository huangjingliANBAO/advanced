package week1.com.soft1841.bookdemo;

import javax.swing.*;
import java.awt.*;

/**
 * 进度条的滚动
 * @author 黄敬理
 * 2019.04.11
 */
public class JoinFrameTest extends JFrame {
    private JProgressBar jProgressBar1;
    private JProgressBar jProgressBar2;
    public JoinFrameTest(){
        init();
        setTitle("进度条的滚动");
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
      jProgressBar1 = new JProgressBar();
      jProgressBar2 = new JProgressBar();
      getContentPane().add(jProgressBar1, BorderLayout.NORTH);
      getContentPane().add(jProgressBar2,BorderLayout.SOUTH);
      jProgressBar1.setStringPainted(true);
      jProgressBar2.setStringPainted(true);
      JoinThreadTest1 jt = new JoinThreadTest1();
      JoinThreadTest2 jt1 = new JoinThreadTest2();
      jt.setjProgressBar1(jProgressBar1);
      jt1.setjProgressBar2(jProgressBar2);
      Thread thread1 = new Thread(jt);
      thread1.start();
      Thread thread2 = new Thread(jt1);
      thread2.start();
    }
    public static void main(String[] args) {
        new JoinFrameTest();
    }
}
