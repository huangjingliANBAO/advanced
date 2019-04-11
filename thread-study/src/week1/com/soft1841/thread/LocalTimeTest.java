package week1.com.soft1841.thread;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LocalTimeTest extends Thread{
    private JLabel localTime;
    public void setLocalTime(JLabel localTime) {
        this.localTime = localTime;
    }
    @Override
    public void run() {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        while (true){
            localTime.setText(String.valueOf(format.format(new Date())));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
