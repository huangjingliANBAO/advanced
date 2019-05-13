package gui1;

import javax.swing.*;

public class TencentFream {
    private JPanel mainPanel;
    private JPanel topPanel;

    public static void main(String[] args)throws Exception {
        //根据系统设置swing的外观
        String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("TencentFream");
        frame.setContentPane(new TencentFream().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1391,794);
        //frame.pack();
        frame.setVisible(true);
    }
}
