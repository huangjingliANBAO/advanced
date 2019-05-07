package Socket2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * 客户端 使用BufferedReader缓冲输入流接收服务端发来的信息
 * @author 黄敬理
 * 2019.05.08
 */
public class Client3 {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",10086);
        System.out.println("成功连接上服务器！");
        //声明BufferedReader对象，通过客户端的输入流接受信息
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String str = buf.readLine();
        System.out.println("服务器端输出内容："+str);
        buf.close();
        client.close();
    }
}