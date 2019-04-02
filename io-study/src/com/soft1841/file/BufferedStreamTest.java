package com.soft1841.file;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {
        String content[] = {"你喜欢我"};
        File file = new File("word.txt");
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try{
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            byte[] bContent = new byte[1024];
          for (int k = 0; k < content.length; k++){
              bContent = content[k].getBytes();
              bos.write(bContent);
          }
            System.out.println("写入成功！\n");

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            {
                try{
                    bos.close();
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            try{
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                byte[] bContent = new byte[1024];
                int len = bis.read(bContent);
                System.out.println("文件处理的信息是：" + new String(bContent,0,len));
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try{
                    bis.close();
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
