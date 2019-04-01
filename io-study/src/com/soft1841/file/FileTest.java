package com.soft1841.file;

import java.io.*;

/**
 * 字符串内容输出到文件的三种方式
 * @author 黄敬理
 * 2019.04.01
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        String str = "I love java";
        File file = new File("D:\\my.txt");
        if (!file.exists()){
            file.createNewFile();
        }
        //字节流输出
         OutputStream outputStream = new FileOutputStream(file,true);//文本内容追加
         outputStream.write(str.getBytes());
         outputStream.close();
//         //字符流输出
//         Writer writer = new FileWriter(file,true);
//         writer.write(str.toCharArray());
//         writer.close();
//         //打印流输出
//         OutputStream outputStream1 = new FileOutputStream(file,true);
//         PrintStream printStream = new PrintStream(file);
//         printStream.print(str);
//         outputStream1.close();
//         printStream.close();


    }
}
