package com.java.util.java.erji;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/**
 * 随机产生两点并计算两点的距离，保存到本地文件中，测试
 * @author 黄敬理
 * 2019.03.27
 */
public class DistanceTest {
    public static void main(String[] args) throws IOException {
        //创建随机数种子
        Random random = new Random();
        //指定图片大小及类型
        BufferedImage bufferedImage = new BufferedImage(1024,768,BufferedImage.TYPE_INT_RGB);
        //获取两个随机点
        int x1 = random.nextInt(1024);
        int x2 = random.nextInt(1024);
        int y1 = random.nextInt(768);
        int y2 = random.nextInt(768);
        //计算两点的距离
        double distance = (Math.sqrt((x1 - x2) * (x1 - x2) + (y1 -y2) * (y1 -y2)));
        //输出两点的距离
        System.out.println("a"+(x1 + y1) + "b"+(x2 +y2));
        System.out.println("ab两点距离为：" + distance);
        //获取画笔
        Graphics graphics = bufferedImage.getGraphics();
        //设置颜色
        graphics.setColor(Color.blue);
        //绘制线段
        graphics.drawLine(x1,y1,x2,y2);
        //将double转为string
        NumberFormat numberFormat = NumberFormat.getInstance();
        String d = numberFormat.format(distance);
        //输入长度
        graphics.drawString(d,(x1 + x2)/2,(y1 + y2)/2);
        //指定文件路径
        File file = new File("D:/xian.jpg");
        //获取字节输出流
        OutputStream out = new FileOutputStream(file);
        //将图片缓冲区通过字节写到文件
        ImageIO.write(bufferedImage,"jpg",out);
        //关闭输出流
        out.close();
    }
}
