package ApplicationDemo;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

import static com.sun.glass.ui.Cursor.setVisible;

/**
 * 文件选择器组件
 * @author 黄敬理
 * 2019.04.02
 */
public class JFileChooseTest extends JFrame implements ActionListener {
    private JButton chooseBtn;
    private JLabel pathLabel;
    private JFileChooser fileChooser;
    public JFileChooseTest(){
        init();
        setTitle("JFileChoose选择器");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        chooseBtn = new JButton("选择文件");
        pathLabel = new JLabel("暂无选择");
        add(chooseBtn, BorderLayout.NORTH);
        chooseBtn.addActionListener(this);
        Font font = new Font("微软雅黑", Font.BOLD, 26);
        pathLabel.setFont(font);
        add(pathLabel);
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new JFileChooseTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("click");
        //创建JFileChooser对象
        fileChooser = new JFileChooser();
        //设置文件选择器的默认路径
//        fileChooser.setCurrentDirectory(new File(""));
        fileChooser.setCurrentDirectory(new File("D:\\"));
      //打开对话框
        int result = fileChooser.showOpenDialog(null);
        //用户点击“确认”按钮
    if (result == JFileChooser.APPROVE_OPTION){
        File file = fileChooser.getSelectedFile();
       try{
           InputStream inputStream = new FileInputStream(file);
           Scanner scanner = new Scanner(inputStream);
           String results = scanner.nextLine();
       } catch (FileNotFoundException e1) {
           e1.printStackTrace();
       }


    }


    }
}
