package com.soft1841.file;

import java.io.*;
import java.util.UUID;

/**
 * 文件复制
 * @author 黄敬理
 * 2019.03.25
 */
public class FileCopy {
    public static void main(String[] args)  throws  IOException{
        //指定源文件
        File srcFile = new File("D:/code.jpg");
        //获取源文件名
        String srcFileName = srcFile.getName();
        int position = srcFileName.indexOf(".");
        //获取扩展名
        String suffixName = srcFileName.substring(position + 1);
        String newName = UUID.randomUUID().toString();
        //指定目标文件
        File destFile = new File("E:/" + newName + "." +suffixName);
        //创建字节数组，大小为源文件长度
        byte[] bytes = new byte[(int) srcFile.length()];
        //创建字节输入流
        InputStream in = new FileInputStream(srcFile);
        //读取数组内容
        in.read(bytes);
        //创建字节输出流
        OutputStream out = new FileOutputStream(destFile);
        //读写数组内容
        out.write(bytes);
        //关闭输入 输出流
        in.close();
        out.close();
    }
}
