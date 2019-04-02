package ApplicationDemo;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class CardLayoutTest extends JFrame implements ActionListener {
    private JPanel cardPanel;//面板
    private JButton preButton, nextButton;//按钮
    private JPanel buttonPanel;//面板
    private CardLayout cardLayout;//卡片

    public CardLayoutTest() {
        init();
        setTitle("CardLayout卡片布局");//标题
        setSize(900, 600);//大小
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void init() {
        cardLayout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(cardLayout);
        for (int i = 0; i < 3; i++) {
            cardPanel.add(String.valueOf(i + 1), getPanel());
        }
        add(cardPanel);
        buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(120, 165, 241));
        preButton = new JButton("上一张");
        nextButton = new JButton("下一张");
        buttonPanel.add(preButton);
        buttonPanel.add(nextButton);
        add(buttonPanel, BorderLayout.SOUTH);
        preButton.addActionListener(this);
        nextButton.addActionListener(this);
    }

    private JPanel getPanel() {
        JPanel newPanel = new JPanel();
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        newPanel.setBackground(new Color(r, g, b));
        return newPanel;
    }

    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        } catch (Exception e) {
            e.printStackTrace();
        }
        new CardLayoutTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == preButton) {
            cardLayout.previous(cardPanel);
        } else {
            cardLayout.next(cardPanel);
        }
    }
}
