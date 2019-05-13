package gui1;

import javax.swing.*;

public class CloudMusicFream {
    private JPanel mainPanel;
    private JPanel leftPanel;
    private JButton 搜索Button;
    private JButton 我的音乐云盘Button;
    private JButton 下载管理Button;
    private JButton 朋友Button;
    private JButton 本地音乐Button;
    private JButton 发现Button1;
    private JButton MVButton1;
    private JPanel centerPanel;
    private JLabel buttonLabel;
    private JLabel bannerLabel;
    private JPanel musicPanel;
    private JLabel music1;
    private JLabel music2;
    private JLabel music3;
    private JLabel music4;
    private JLabel music5;
    private JButton 我的收藏Button;
    private JButton 我喜欢的音乐Button;
    private JButton 收藏的歌单Button;
    private JLabel me;

    public static void main(String[] args) throws Exception{
        //根据系统设置swing的外观
        String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        UIManager.setLookAndFeel(lookAndFeel);
        JFrame frame = new JFrame("CloudMusicFream");
        frame.setContentPane(new CloudMusicFream().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //设置窗体全屏
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
    }
}
