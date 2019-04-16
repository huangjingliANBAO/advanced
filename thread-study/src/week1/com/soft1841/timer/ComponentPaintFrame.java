package week1.com.soft1841.timer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * 组件绘制
 * @author 黄敬理
 * 2019.04.16
 */
public class ComponentPaintFrame extends JFrame {
    public ComponentPaintFrame(){
        init();
        setTitle("组件绘制");
        setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public  void  init(){
        JPanel jPanel = new JPanel(){
            protected  void  paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("D:/image/yue.jpg"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,200,200));
        add(jPanel);
        JButton jButton = new JButton(){
            protected  void  paintComponent(Graphics g){
                try {
                    Image bg = ImageIO.read(new File("D:/image/button.png"));
                    g.drawImage(bg,0,0,getWidth(),getHeight(),null);
                    g.drawString("hello world",55,25);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        jButton.setPreferredSize(new Dimension(150,50));
        jButton.setFocusPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);
        jPanel.add(jButton);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ComponentPaintFrame();

    }
}

