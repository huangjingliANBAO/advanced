package jframe;

import javax.swing.*;
import java.awt.*;

/**
 * 使用网格布局显示26个英文字母
 * @author 黄敬理
 * 2019.03.26
 */
public class LetterLayoutPosition  extends JFrame {
    public LetterLayoutPosition(){
        init();
        setTitle("窗体标题");
        setSize(1200,800);
        //窗体居中
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        Container container = getContentPane();
      setLayout(new GridLayout(9,3,5,5));
      String[] letter = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
      "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      for (int i = 0; i < letter.length; i++){
          container.add(new JButton(letter[i]));
      }
    }
    public static void main(String[] args) {
        new LetterLayoutPosition();
    }
}
