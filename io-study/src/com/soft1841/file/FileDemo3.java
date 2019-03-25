package com.soft1841.file;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        for(int i = 1; i<= 10; i++){
            File folder = new File ("D:\\" + "chap" +i);
            folder.mkdir();
        }
    }
}
