package week1.com.soft1841.timer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ClockTimerFrame extends JFrame {
    private TimerTask clockTask;
    private Timer timer;
    private JPanel jPanel;
    private JButton jButton;
    public ClockTimerFrame(){
       init();
       setTitle("绘制时钟");
       setExtendedState(MAXIMIZED_BOTH);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init(){
        jPanel = new JPanel(){
            protected void paintComponent(Graphics g){
                Image bg = null;
                try {
                    bg = ImageIO.read(new File("D:/image/yue.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                g.drawImage(bg,0,0,getWidth(),getHeight(),null);

            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(jPanel);
        jButton = new JButton(){
           protected void paintComponent(Graphics g){
               Image bg = null;
               try {
                   bg = ImageIO.read(new File("D:/image/clock.png"));
               } catch (IOException e) {
                   e.printStackTrace();
               }
               g.drawImage(bg,0,0,getWidth(),getHeight(),null);
               SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               Date date = new Date();
               g.drawString(format.format(date),5,55);
           }
        };
        Font font = new Font("微软雅黑", Font.BOLD, 40);
        jButton.setFont(font);
        jButton.setPreferredSize(new Dimension(450,100));
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);
        jPanel.add(jButton);
        clockTask = new TimerTask() {
          @Override
          public void run() {
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
              String timeString = sdf.format(new Date());
              if (timeString.equals("2019-04-16 9:45:21")){
                  JOptionPane.showMessageDialog(jButton,"叮咚 叮咚 叮咚");
                  this.cancel();
              }
          }
      };
      timer = new Timer();
      timer.scheduleAtFixedRate(clockTask,0,1000);
    }

    public static void main(String[] args) {
        new ClockTimerFrame();
    }
}
