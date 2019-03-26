package jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 流布局管理器
 * @author 黄敬理
 * 2019.03.24
 */
public class Poetry extends JFrame {
 public Poetry(){
     setTitle("本窗体使用流布局管理器");
     Container c = getContentPane();
     setLayout(new GridLayout(5,1,5,5));
     setSize(600,400);
     setResizable(false);
     c.add(new JButton("下面四句诗,哪一句是描写夏天的?"));
     c.add(new JButton("A.秋风萧瑟天气凉,草木摇荡露为霜"));
     c.add(new JButton("B.白雪纷纷何所似,撒盐空中差可似"));
     c.add(new JButton("C.接天莲叶无穷碧，映日荷花别样红。"));
     c.add(new JButton("D.竹外桃花三两枝，春江水暖鸭先知。"));
     setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
     setVisible(true);
 }
    public static void main(String[] args) {
        new Poetry();
    }
}
