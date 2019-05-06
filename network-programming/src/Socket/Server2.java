package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端给服务端发送文本信息
 */
public class Server2 {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        System.out.println("服务器启动");
        InputStream in;
        while (true){
            Socket socket = ss.accept();
            System.out.println("客户端：" + socket.getInetAddress() + "上线了");
            in = socket.getInputStream();
            byte[] bytes = new byte[1024];
            in.read(bytes);
            System.out.println("客户端发送的是：" + new String(bytes));
            in.close();
            socket.close();
        }
    }
}
