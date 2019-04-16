package week1.com.soft1841.timer;

import javax.swing.*;
import java.awt.*;

public class ShadeBackgroundImage extends JFrame {
    private JPanel contentPane;
    private JLabel accountLabel, passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton confirmButton, cancelButton;
    private int width;
    private int height;

    public static void main(String[] args) {
        ShadeBackgroundImage frame = new ShadeBackgroundImage();
        frame.setVisible(true);
    }
    public ShadeBackgroundImage() {
        setTitle("背景为渐变色的主界面");// 设置窗体标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 600);
        init();
    }
    public void init(){
        contentPane = new JPanel();// 创建内容面板
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        ShadePanelDemo shadePanel = new ShadePanelDemo();// 创建渐变背景面板
        contentPane.add(shadePanel, BorderLayout.CENTER);// 添加面板到窗体内容面板


        setLayout(null);
        ShadePanel shadePanel1 = new ShadePanel();
        shadePanel.setLayout(null);
        shadePanel.setBounds(0, 0, width, height);
        ImgPanel imgPanel = new ImgPanel();
        imgPanel.setLayout(null);
        imgPanel.setImgPath("bg.jpg");
        imgPanel.setBounds(700, 50, 500, 900);
        Font font = new Font("楷体", Font.PLAIN, 30);
        accountLabel = new JLabel("账号");
        accountLabel.setFont(font);
        accountLabel.setForeground(new Color(242, 242, 242));
        accountField = new JTextField();
        accountField.setFont(font);
        passwordLabel = new JLabel("密码");
        passwordLabel.setFont(font);
        passwordLabel.setForeground(new Color(242, 242, 242));
        passwordField = new JPasswordField();
        passwordField.setFont(font);
        confirmButton = new JButton("确认");
        confirmButton.setFont(font);
        cancelButton = new JButton("取消");
        cancelButton.setFont(font);
        accountLabel.setBounds(40, 150, 100, 35);
        accountField.setBounds(240, 150, 260, 35);
        passwordLabel.setBounds(40, 220, 100, 35);
        passwordField.setBounds(240, 220, 260, 35);
        confirmButton.setBounds(60,260,100,35);
        cancelButton.setBounds(160,260,100,35);

    }
}

