package jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 按钮组件
 * @author 黄敬理
 * 2019.04.03
 */
public class JButtonTest extends JFrame {
    public JButtonTest(){
        init();
        setTitle("JButton按钮组件");
        setSize(1000,700);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
    public void init(){
        Icon icon = new ImageIcon();
        setLayout(new GridLayout(3,2,5,5));
        Container c = getContentPane();
        JButton btn[] = new JButton[6];
        for (int i = 0;i < btn.length; i++){
            btn[i] = new JButton();
            c.add(btn[i]);
        }
        btn[0].setText("不可用");
        btn[0].setEnabled(false);   
        btn[1].setText("有背景色");
        btn[1].setBackground(Color.GREEN);
        btn[2].setText("无边框");
        btn[2].setBorderPainted(false);
        btn[3].setText("有边框");
        btn[3].setBorder(BorderFactory.createLineBorder(Color.RED));
        btn[4].setIcon(icon);
        btn[4].setToolTipText("图片按钮");
        btn[5].setText("可点击");
        btn[5].addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
            }
        });
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}
