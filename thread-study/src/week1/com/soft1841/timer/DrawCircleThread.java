package week1.com.soft1841.timer;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class DrawCircleThread implements Runnable {
 private JFrame jFrame;
    public void setjFrame(JFrame jFrame) {
        this.jFrame = jFrame;
    }
    @Override
    public void run() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                int x = 800;
                int y = 600;
                int i = 0;
                Random random = new Random();
                while(true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Graphics g = jFrame.getGraphics();
                    //设置线条的粗细
                    Graphics2D g2d = (Graphics2D)g;
                    Stroke stroke = new BasicStroke(8.0f);
                    g2d.setStroke(stroke);
                    g.setColor(getRandomColor());//给画笔设置随机数颜色
                    i = random.nextInt(20);
                    g.drawOval(x/2 - (i + 1) * 10,y/2 - (i + 1) * 10,10 + 20 * i,10+20 * i);
                }
            }
            private Color getRandomColor() {
                Color color=new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
                return color;
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,1000,500);
    }
}
