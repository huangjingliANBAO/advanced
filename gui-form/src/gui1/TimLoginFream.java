package gui1;

import javax.swing.*;

public class TimLoginFream {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox 记住密码CheckBox;
    private JCheckBox 自动登录CheckBox;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TimLoginFream");
        frame.setContentPane(new TimLoginFream().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
