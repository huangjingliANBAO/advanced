package week1.com.soft1841.thread;
import javax.swing.*;

public class CarouselFream extends JFrame {
    private JLabel imageLabel;
    public CarouselFream(){
        init();
        setTitle("窗体轮播背景图");
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private void init(){
      imageLabel = new JLabel();
      add(imageLabel);
      CarouselThreadTest ct = new CarouselThreadTest();
      ct.setImageLabel(imageLabel);
      new Thread(ct).start();
    }
    public static void main(String[] args) {
        new CarouselFream();
    }
}
