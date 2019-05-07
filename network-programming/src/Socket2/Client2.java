package Socket2;

import java.io.*;
import java.net.Socket;

/**
 * 客户端
 *
 */
public class Client2 {
    public static void main(String[] args)throws IOException {
        Socket client = new Socket("localhost",10086);
        System.out.println("成功连接到服务器");
        //客户端要发送的文件，先通过字节输入流读入字节数组
        File file = new File("D:/image/31.png");
        byte[] bytes = new byte[(int) file.length()];
        InputStream is = new FileInputStream(file);
        is.read(bytes);
        //将数组b通过缓冲字节输出流传出去
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(bytes);
        bos.close();
        is.close();
    }
}
