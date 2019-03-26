package com.soft1841.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * 系统时间命名文件名
 * @author 黄敬理
 * 2019.03.25
 */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        LocalDate today1 = LocalDate.now();
       File pate = new File("D:\\" + today1);
       if (!pate.exists()){
           pate.mkdirs();
       }
       File file = new File(pate + "/" + "hello.txt");
       if (!file.exists()){
           file.createNewFile();
       }
    }
}
