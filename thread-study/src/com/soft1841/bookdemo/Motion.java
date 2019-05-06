package com.soft1841.bookdemo;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 使用线程和swing 圆点和五角星在窗体做无规则运动
 * @author 黄敬理
 * 2019.05.06
 */
public class Motion extends JFrame {
    private JPanel panel,runPanl;
    private JLabel circle,star,trangle,square;
    private JButton btnStart;
    public Motion(){
        init();
        setTitle("图标运动");
        setSize(1000,800);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        //内容面板
       panel = new JPanel();
       setContentPane(panel);
       panel.setLayout(null);
       //充当运动区域的面板
        runPanl = new JPanel();
        runPanl.setBorder(new LineBorder(Color.BLACK,1,true));
        runPanl.setBounds(10,10,350,270);
        panel.add(runPanl);
        runPanl.setLayout(null);
        //显示圆点的标签
        circle = new JLabel("●");
        circle.setBounds(27,53,20,20);
        runPanl.add(circle);
        //显示五角星的标签
        star = new JLabel("★");
        star.setBounds(330,189,20,20);
        runPanl.add(star);
        //显示三角形的标签
        trangle = new JLabel("▲");
        trangle.setBounds(100,100,20,20);
        runPanl.add(trangle);
        //显示正方形的标签
        square = new JLabel("■");
        square.setBounds(150,130,20,20);
        runPanl.add(square);
        //启动线程
        MyThread c = new MyThread(circle,runPanl);
        MyThread s = new MyThread(star,runPanl);
        MyThread t = new MyThread(trangle,runPanl);
        MyThread sq = new MyThread(square,runPanl);
        //“开始”按钮
        btnStart = new JButton("开始");
        btnStart.setBounds(267,290,93,23);
        panel.add(btnStart);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btnStart.getText().equals("开始")){
                    c.start();
                    s.start();
                    t.start();
                    sq.start();
                    btnStart.setText("暂停");
                }else if (btnStart.getText().equals("暂停")){
                    c.stopRun();
                    s.stopRun();
                    t.stopRun();
                    sq.stopRun();
                    btnStart.setText("继续");
                }else if (btnStart.getText().equals("继续")){
                    c.goRun();
                    s.goRun();
                    t.goRun();
                    sq.goRun();
                    btnStart.setText("暂停");
                }
            }
        });



    }

    public static void main(String[] args) {
        new Motion();
    }
}
class MyThread extends Thread{
    boolean run = false;
    JLabel jLabel;
    JPanel panel;

    /**
     * 以标签，面板为参数的构造方法，利用构造方法初始化话变量
     * @param l
     * @param p
     */
    public MyThread(JLabel l,JPanel p){
        jLabel = l;
        panel = p;
    }
    synchronized void goRun(){
        run = false;
        notify();//唤醒等待（wait（））的线程
    }
    synchronized  void stopRun(){
        run = true;
    }
    @Override
    public void run(){
        int px = panel.getWidth() - jLabel.getWidth();
        int py = panel.getHeight() - jLabel.getHeight();
        int xadd = 1,yadd = 1;
        while (true){
            synchronized (this){
                while (run){
                    System.out.println(run);
                    try{
                        wait();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
            int x = jLabel.getX();
            int y = jLabel.getY();
            if (x <= 0|| x>= px){
                xadd *= -1;
            }
            if (y <= 0||y>=py){
                yadd *= -1;
            }
            jLabel.setBounds(x + xadd,y + yadd,jLabel.getWidth(),jLabel.getHeight());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}