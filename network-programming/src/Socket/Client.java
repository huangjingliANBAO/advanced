package Socket;

import java.io.IOException;
import java.net.Socket;

/**
 * 第一个网络编程
 * @author 黄敬理
 * 2019.05.06
 */
public class Client {
    public static void main(String[] args)throws IOException {
        //创建客户端对象，指定连接的IP和端口
        Socket socket = new Socket("192.168.43.44",8080);
        System.out.println("已和服务器建立连接，远程主机地址：" + socket.getRemoteSocketAddress());
    }
}
