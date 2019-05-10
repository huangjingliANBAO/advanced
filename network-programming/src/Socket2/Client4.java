package Socket2;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.util.UUID;

/**
 * 客户端
 * @author 黄敬理
 * 2019.05.09
 */
public class Client4 {
    public static void main(String[] args)throws IOException {
        Socket client = new Socket("127.0.0.1",10086);
        System.out.println("成功连接服务器");
        InputStream in = client.getInputStream();
        BufferedInputStream bis = new BufferedInputStream(in);
        System.out.println("请输入要保存的路径:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        File file = new File(path + "/" + UUID.randomUUID().toString() + ".jpg");
        OutputStream os = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        byte[] bytes = new byte[1024];
        int tmp;
        while ((tmp = bis.read(bytes)) != -1){
            bos.write(bytes,0,tmp);
        }
        bos.close();
        bis.close();
    }
}
