package instance;

import javax.swing.*;
import java.awt.*;

/**
 * JPanel面板实例
 * @author 黄敬理
 * 2019.04.04
 */
public class JPanelTest extends JFrame {
    public JPanelTest(){
       init();
       setTitle("JPanel面板");//设置标题
       setSize(600,400);//设置窗体大小
       setVisible(true);//设置窗体可见
       setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//设置窗体关闭方式
    }
    public void init(){
        Container c = getContentPane();//创建容器
        // 设置容器为网格布局
        c.setLayout(new GridLayout(2,2,10,10));
        //第一个面板，此面板使用1行3列的网格布局，组件水平间隔10像素，垂直间隔10像素
        JPanel p1 = new JPanel(new GridLayout(1,3,10,10));
        //第二个面板使用边界布局
        JPanel p2 = new JPanel(new BorderLayout());
        //第三个面板使用流布局
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        //第四个面板使用网格布局
        JPanel p4 = new JPanel(new GridLayout(2,2,10,10));
        //给每个面板添加边框和标题，使用BorderFaction工厂类生成带标题的边框对象
        p1.setBorder(BorderFactory.createTitledBorder("面板1"));
        p2.setBorder(BorderFactory.createTitledBorder("面板2"));
        p3.setBorder(BorderFactory.createTitledBorder("面板3"));
        p4.setBorder(BorderFactory.createTitledBorder("面板4"));
        //在面板中添加按钮
        for (int i = 0; i < 4; i++){
            p1.add(new JButton("p1"));
            p2.add(new JButton("p2"));
            p3.add(new JButton("p3"));
            p4.add(new JButton("p4"));
        }
        //在容器中添加面板
        c.add(p1);
        c.add(p2);
        c.add(p3);
        c.add(p4);
    }
    public static void main(String[] args) {
        new JPanelTest();
    }
}
