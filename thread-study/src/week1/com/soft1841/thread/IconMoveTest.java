package week1.com.soft1841.thread;

import javax.swing.*;

public class IconMoveTest implements  Runnable  {
    private JLabel iconLabel;

    public void setIconLabel(JLabel iconLabel) {
        this.iconLabel = iconLabel;
    }

    @Override
    public void run() {
        int x = 0;
        while ( x <= 600){
            //图标坐标
            iconLabel.setBounds(x ,100,200,100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x += 20;
            if (x >= 600){
                x = 10;
            }
        }
    }
}
