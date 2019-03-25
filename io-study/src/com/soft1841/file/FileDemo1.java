package com.soft1841.file;

import java.io.File;
import java.io.IOException;

/**
 * File学习
 */
public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        //创建文件
        File file = new File("D:/README.md");
        //判断文件是否存在
        if(!file.exists()){
            file.createNewFile();
        }
    }
}
