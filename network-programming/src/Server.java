import java.net.ServerSocket;
import java.net.Socket;

/**
 * 第一个网络编程
 * @author 黄敬理
 * 2019.05.06
 */
public class Server {
    public static void main(String[] args)throws Exception {
        //创建服务器对象，映射端口10086
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动，端口号：" + ss.getLocalPort());
        while (true){
            Socket socket = ss.accept();
            System.out.println("客户端：" + socket.getInetAddress() + "上线了");
            socket.close();
        }
    }
}
