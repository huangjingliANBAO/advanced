package com.soft1841.word;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class CrossTheRoad extends JFrame implements ActionListener {
    private JButton musicButton;
    private JLabel carLabel;
    private Icon carIcon;

    public CrossTheRoad()throws Exception{
      init();
      setTitle("模拟过马路");
      setSize(1920,1080);
      setLocationRelativeTo(null);//窗体居中
      setResizable(false);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private void init() throws Exception{
        //获取本地图片
        File file = new File("D:/ICON/car.png");
        InputStream in = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        in.read(bytes);
        in.close();

        musicButton = new JButton("点击播放");
        add(musicButton);
        musicButton.addActionListener(this);

        carLabel = new JLabel();
        add(carLabel);
        carIcon = new ImageIcon(bytes);
        carLabel.setIcon(carIcon);
        //启动线程
        CarThread ct = new CarThread();
        ct.setCarLavel(carLabel);
        Thread thread = new Thread(ct);
        thread.start();
    }
    public static void main(String[] args)throws  Exception {
        new CrossTheRoad();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      try{
          URL cb;
          File file = new File("E:/music/1.wav");
          cb = file.toURL();
          AudioClip auu;
          auu = Applet.newAudioClip(cb);
          /**
           * auu.play()循环播放
           * auu.stop()单曲播放后停止
           */
          auu.play();
          auu.loop();
      }catch (MalformedURLException e1){
          e1.printStackTrace();
      }
    }
}
