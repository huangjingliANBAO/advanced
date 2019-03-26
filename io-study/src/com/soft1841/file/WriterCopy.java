package com.soft1841.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/**
 * 控制台输入内容上传到文件
 * @author 黄敬理
 * 2019.03.26
 */
public class WriterCopy {
    public static void main(String[] args) throws IOException {
       //创建控制台
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容");
        String str = scanner.next();
        //将控制台输出信息读入byte[]数组
      byte[] bytes = str.getBytes();
        //创建目标路径
       File destFile = new File("D:/hello.txt");
        //创建字节输出流
       OutputStream out = new FileOutputStream(destFile);
        //读写数组内容
       out.write(bytes);
       out.close();
    }
}
