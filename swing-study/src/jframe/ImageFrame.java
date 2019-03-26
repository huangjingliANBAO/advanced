package jframe;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * 图片窗体程序
 * @author 黄敬理
 * 2019.03.26
 */
public class ImageFrame extends JFrame {
    private JPanel topPanel;
    private JLabel dateLabel;
    private JButton[] buttons;
    private JLabel imgLabel;
    private Icon icon;
    private JLabel originPanel;
    public ImageFrame() throws IOException {
        init();
        setTitle("窗体标题");
        setSize(1200,800);
        //窗体居中
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    //设置布局，放置组件
    public void init() throws IOException {
       topPanel = new JPanel();
       buttons = new JButton[5];
       for(int i = 0 ; i < 5;i++){
        buttons[i] = new JButton("按钮" + i +1);
        topPanel.add(buttons[i]);
       }
       add(topPanel, BorderLayout.NORTH);
       //读入本地的图片到内存的字节数组
       imgLabel = new JLabel("图片");
       File srcFile = new File("D:/image.jpg");
       FileInputStream inputStream ;
       byte[] bytes = new byte[0];
      try {
           inputStream = new FileInputStream(srcFile);
         bytes = new byte[(int) srcFile.length()];
          inputStream.read(bytes);
      }catch (IOException e){
            System.out.println("io异常");
        }
        icon = new ImageIcon(bytes);
      imgLabel.setIcon(icon);
      add(imgLabel,BorderLayout.CENTER);
      //系统时间
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = format.format(new Date());
        dateLabel = new JLabel(date);
        add(dateLabel,BorderLayout.WEST);
        //获取绝对路径
        String origin = srcFile.getAbsolutePath();
        originPanel = new JLabel(origin);
        add(originPanel,BorderLayout.SOUTH);
      }
    public static void main(String[] args) throws IOException {
        new ImageFrame();
    }
}
