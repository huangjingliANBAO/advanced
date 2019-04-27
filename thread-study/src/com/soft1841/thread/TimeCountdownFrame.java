package com.soft1841.thread;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeCountdownFrame {
    private JFrame frame;//定义frame
    private JLabel jLabel;//定义标签
    private JPanel jPanel;//定义面板
    //String - Date
    private Date String2Date(String dateStr){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
    //倒计时主要代码块
    private void getTime(String dateStr){
        Date end = String2Date(dateStr);
        long time = (end.getTime() - 1 - new Date().getTime()) / 1000;//自定义倒计时
        long hour = 0;
        long minute = 0;
        long seconds = 0;
        while (time > 0){
            hour = time / 3600;
            minute = (time - hour * 3600) / 60;
            seconds = time - hour * 3600 - minute * 60;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<html><br>距离").append(dateStr).append("还有<br><br>")
                    .append(hour).append("时 ").append(minute).append("分 ").append(seconds).append("秒 ")
                    .append("</html>");
            jLabel.setText(stringBuilder.toString());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;
        }
    }
    public TimeCountdownFrame() {
        init();
        frame.setTitle("时间倒计时");
        frame.setSize(330, 160);
        frame.setVisible(true);
        frame.setLocation(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init() {
        frame = new JFrame("倒计时");
        jLabel = new JLabel();
        jPanel = new JPanel();
        jPanel.add(jLabel);
        frame.add(jPanel);
    }
    public static void main(String[] args) {
        new TimeCountdownFrame().getTime("2019-04-18 10:00:00");
    }
}

