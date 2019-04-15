package week1.com.soft1841.test;

import javax.swing.*;
import java.io.*;

public class ChooserThread implements Runnable {
    private JLabel bgLabel;
    private JFileChooser fileChooser;

    public void setBgLabel(JLabel bgLabel) {
        this.bgLabel = bgLabel;
    }

    @Override
    public void run() {
       fileChooser = new JFileChooser();
       fileChooser.setCurrentDirectory(new File("D:/image"));
       fileChooser.setMultiSelectionEnabled(true);
       int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] files = fileChooser.getSelectedFiles();
            int i = 0;
            int len = files.length;
            while (true){
                File file = new File(String.valueOf(files[i]));
                try {
                    InputStream in = new FileInputStream(file);
                    byte[] bytes = new byte[(int) file.length()];
                    in.read(bytes);
                    Icon icon = new ImageIcon(bytes);
                    bgLabel.setIcon(icon);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    if (i == len){
                        i = 0;
                    }
                } catch (IOException e) {
                    System.out.println("IO异常");
                }
            }

        }
    }
}
