package com.soft1841.file;

import java.io.*;

/**
 * BufferedReader类与BufferedWriter类
 * @author 黄敬理
 * 2019.04.04
 */
public class BufferedTest {
    public static void main(String[] args) {
        String content[] = {"你不喜欢我","我一点也不介意","因为我一无所有","是否我真的一无所有"};
        File file = new File("word.txt");
        try{
            //创建FileWriter类
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);
            for(int i = 0; i < content.length; i++){
                //将字符串数组中元素写入磁盘
                bufw.write(content[i]);
                //将数组中的单个元素以单行形式写入文件
                bufw.newLine();
            }bufw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int j = 0;
            while((s = bufr.readLine()) != null){
                j++;
                System.out.println("第" + j + "行:" + s);
            }
            bufr.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
