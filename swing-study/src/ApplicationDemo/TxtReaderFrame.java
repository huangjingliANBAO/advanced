package ApplicationDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Txt窗体阅读器
 * @author 黄敬理
 * 2019.04.01
 */
public class TxtReaderFrame extends JFrame implements ActionListener {
    private JTextField inputField;
    private JButton confirmButton;
    private JPanel topPanel;
    private JTextArea contentArea;
    private JLabel imgJLabel;
    private Icon icon;

    public TxtReaderFrame(){
        init();
        setTitle("文本阅读窗体");
        setSize(new Dimension(640,480));
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void init(){
        inputField = new JTextField(20);
        inputField.setPreferredSize(new Dimension(120,40));
        confirmButton = new JButton("确认");
        confirmButton.setPreferredSize(new Dimension(100,40));
        //给按钮注册监听
        confirmButton.addActionListener(this);
        topPanel = new JPanel();
        topPanel.add(inputField);
        topPanel.add(confirmButton);
        add(topPanel,BorderLayout.NORTH);
        contentArea = new JTextArea();
        add(contentArea,BorderLayout.CENTER);
        imgJLabel = new JLabel();
        add(imgJLabel,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        new TxtReaderFrame();
    }
    @Override
        public void actionPerformed(ActionEvent e) {
       //获取输入框内容
        String filePath = inputField.getText().trim();
        //创建文件
        File file = new File(filePath);
        //使用三种方法将file中的内容读入
        try {
            InputStream inputStream = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            inputStream.read(bytes);
            inputStream.close();
            icon = new ImageIcon(bytes);
            imgJLabel.setIcon(icon);
            //在文本框追加换行
            contentArea.append("\r\n");
        } catch (IOException e1) {
           JOptionPane.showMessageDialog(null,"IO异常");
        }
    }
}
