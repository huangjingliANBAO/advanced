package com.soft1841.file;

import java.io.*;

/**
 * 使用缓冲字节流实现文件的拷贝
 */
public class Test1 {
    public static void main(String[] args)throws Exception{
        File srcFile = new File("e:/salary.txt");
        if (srcFile.exists()){
            File destFile = new File("e:/日记/salary.txt");
            InputStream in = new FileInputStream(srcFile);
            BufferedInputStream bis = new BufferedInputStream(in);
            int i = bis.read();
            OutputStream out = new FileOutputStream(destFile);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            bos.write(i);
            in.close();
            out.close();
            bis.close();
        }else{
            System.out.println("文件不存在");
        }
    }
}
