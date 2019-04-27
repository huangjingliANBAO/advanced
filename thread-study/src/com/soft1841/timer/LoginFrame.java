package com.soft1841.timer;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class LoginFrame extends JFrame implements ActionListener {
    private JLabel accountLabel, passwordLabel;
    private JTextField accountField;
    private JPasswordField passwordField;
    private JButton confirmButton, cancelButton;
    private int width;
    private int height;

    public LoginFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.width;
        height = screenSize.height;
        init();
        setTitle("渐变色背景窗体");
        setSize(width, height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void init() {
        setLayout(null);
        ShadePanel shadePanel = new ShadePanel();
        shadePanel.setLayout(null);
        shadePanel.setBounds(0, 0, width, height);
        ImgPanel imgPanel = new ImgPanel();
        imgPanel.setLayout(null);
        imgPanel.setImgPath("");
        imgPanel.setBounds(700, 50, 1000, 600);
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
        accountField.setBounds(200, 150, 260, 35);
        passwordLabel.setBounds(40, 220, 100, 35);
        passwordField.setBounds(200, 220, 260, 35);
        confirmButton.setBounds(60,300,100,35);
        cancelButton.setBounds(220,300,100,35);
        imgPanel.add(accountLabel);
        imgPanel.add(accountField);
        imgPanel.add(passwordLabel);
        imgPanel.add(passwordField);
        imgPanel.add(confirmButton);
        imgPanel.add(cancelButton);

        shadePanel.add(imgPanel);
        add(shadePanel);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "播放音乐");
    }
}

/**
 * 继承JPanel的自定义面板，实现渐变背景色，paintComponent重绘组件
 */
class ImgPanel1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g1) {
        Graphics2D g = (Graphics2D) g1;
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        //创建填充模式对象
        GradientPaint paint = new GradientPaint(0, 0, Color.CYAN, 0, height, Color.lightGray);
        g.setPaint(paint);
        g.fillRect(0, 0, width, height);
    }
}

/**
 * 继承JPanel的自定义面板，绘制背景图
 */
class ShadePanel1 extends JPanel {
    private String imgPath;

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    @Override
    protected void paintComponent(Graphics g) {
        String basePath = System.getProperty("user.dir");
        Image bg = null;
        try {
            bg = ImageIO.read(new File(basePath + "/Thread-study/src/img/" + imgPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}

