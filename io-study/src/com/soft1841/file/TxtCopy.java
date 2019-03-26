package com.soft1841.file;

import java.io.*;

/**
 * 文件复制
 * @author 黄敬理
 */
public class TxtCopy {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("D:/hello.txt");
        if (srcFile.exists()){
            File destFile = new File("D:/hello副本.txt");
            Reader in = new FileReader(srcFile);
            char[] chars = new char[(int) srcFile.length()];
            //读取数组内容
            in.read(chars);
            Writer out = new FileWriter(destFile);
            //读写数组内容
            out.write(chars);
            out.close();
            in.close();
        }else {
            System.out.println("该文件不存在");
        }



    }
}
