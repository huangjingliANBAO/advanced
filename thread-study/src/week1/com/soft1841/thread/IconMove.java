package week1.com.soft1841.thread;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URL;

public class IconMove  extends JFrame {
    private JLabel iconLabel;
    private Icon icon;
    public IconMove() throws IOException {
        init();
        setTitle("小图标移动");
        setSize(1000,600);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private void init() throws IOException {
        iconLabel = new JLabel();
        add(iconLabel);

        File file = new File("D:/carousel/lanbo.png");
        InputStream  in = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        in.read(bytes);
        in.close();
        icon = new ImageIcon(bytes);
        iconLabel.setIcon(icon);

        IconMoveTest im = new IconMoveTest();
        im.setIconLabel(iconLabel);
        new Thread(im).start();
    }
    public static void main(String[] args) throws IOException {
        new IconMove();
    }

}
