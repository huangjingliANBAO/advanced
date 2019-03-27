package jframe;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;

/**
 * 网格布局
 * @author 黄敬理
 * 2019.03.27
 */
public class GridLayoutPositionDemo extends JFrame {
    //定义一个面板数组
    private JPanel[] panels;
    private JLabel dateLabel;
    private JLabel imgLabel;
    private Icon icon;
    private JLabel nameLabel;
    private JRadioButton radioButton;
    private GridLayoutPositionDemo(){
        init();
        setTitle("GridLayout网格布局管理器");
        //界面启动最大化
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        //设置整个容器背景
        getContentPane().setBackground(new Color(133, 197, 219));
        //设置3行3列的网格,组件间水平间距50像素，垂直间距30像素
        GridLayout gridLayout = new GridLayout(3,3,50,30);
        setLayout(gridLayout);
        //创建面板数组
        panels = new JPanel[9];
        //循环创建每个面板对象
        for (int i = 0;i<9;i++){
            panels[i] = new JPanel();
            //面板加上边框
            panels[i].setBorder(BorderFactory.createTitledBorder("面板" + (i + 1)));
            //面板依次加入网格布局管理器，变成9宫格
            add(panels[i]);
        }
        //设置第一个面板的背景颜色，其布局方式默认为FlowLayout居中对齐
        panels[0].setBackground(new Color(2,5,6,8));
        //在第一个面板内加入5个按钮
        for (int i =0;i<5;i++){
            panels[0].add(new JButton("java"));
        }
        //设置第二个面板为BorderLayout边界布局，设置背景颜色
        panels[1].setLayout(new BorderLayout(20,20));
        panels[1].setBackground(new Color(221, 208, 137));
        //5个方向加入按钮
        panels[1].add(new JButton("北"),BorderLayout.NORTH);
        panels[1].add(new JButton("南"),BorderLayout.SOUTH);
        panels[1].add(new JButton("西"),BorderLayout.WEST);
        panels[1].add(new JButton("东"),BorderLayout.EAST);
        panels[1].add(new JButton("中"),BorderLayout.CENTER);
        //设置第三面板为GirdLayout网格布局,设置颜色
        panels[2].setLayout(new GridLayout(10,10,1,1));
        panels[2].setBackground(new Color(219, 130, 130));
        //依次加入9个按钮
        for (int i =0;i<100;i++){
            panels[2].add(new JButton(String.valueOf(i +1)));
        }
        //设置第四面板为流式布局，加入滚动面板
        panels[3].setLayout(new GridLayout(5,1,1,1));
        panels[3].setBackground(new Color(10, 110, 170));
        //设置第五面板为流式布局，加入标签组件
        panels[4].setBackground(new Color(219, 130, 130));
        //创建JLabel组件
        LocalDateTime time = LocalDateTime.now();
        dateLabel = new JLabel(String.valueOf(time));
        panels[4].add(dateLabel);
        //设置第六面板为BorderLayout边界布局，加入标签组件
        panels[5].setLayout(new BorderLayout(20,20));
        panels[5].setBackground(new Color(221, 208, 137));
        //读入本地图片到到内存的字节数组
        imgLabel = new JLabel();
        File srcFile = new File("D:/image.jpg");
        InputStream inputStream;
        byte[] bytes = null;
        try {
            inputStream = new FileInputStream(srcFile);
            bytes = new byte[(int) srcFile.length()];
            inputStream.read(bytes);
        } catch (IOException e) {
            System.out.println("io异常");
        }
        icon = new ImageIcon(bytes);
        imgLabel.setIcon(icon);
        panels[5].add(imgLabel,BorderLayout.CENTER);
        //在南部放图片路径
        String name = srcFile.getPath();
        nameLabel = new JLabel(name);
        panels[5].add(nameLabel,BorderLayout.SOUTH);
        panels[6].setBackground(new Color(221, 208, 137));
        setLayout(new GridLayout(3,3,50,50));
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
                "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for (int i = 0; i < letters.length; i++){
            radioButton = new JRadioButton(letters[i]);
            panels[6].add(radioButton);
        }
        //设置第八面板为流式布局，加入文本域组件
        setLayout(new GridLayout(3,3,1,1));
    String[] letter = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
     "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
     for (int i = 0; i < letter.length; i++){
         radioButton = new JRadioButton(letter[i]);
         panels[7].add(radioButton);
     }
        panels[7].setBackground(new Color(221, 208, 137));
        //设置第九面板为GirdLayout网格布局，加入单选按钮
        panels[8].setBackground(new Color(219, 130, 130));
        panels[8].setLayout(new GridLayout(3,3,10,10));
        //创建文本为“A”的单选按钮
        String[] strings = {"是","否","我","真","的","一","无","所","有"};
        for (int i =0;i<9 ;i++){
            radioButton = new JRadioButton(strings[i]);
            panels[8].add(radioButton);
        }
    }
    public static void main(String[] args) {
        //用系统样式代替Swing默认样式
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (Exception e){
            e.printStackTrace();
        }
        new GridLayoutPositionDemo();
    }
}