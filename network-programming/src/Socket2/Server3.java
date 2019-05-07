package Socket2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端向客户端发送信息-控制台版本
 * server端使用PrintStream打印流向客户端输出文本内容
 * @author 黄敬理
 * 2019.05.08
 */
public class Server3{
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        while (true){
            Socket socket = serverSocket.accept();
            ServerThread3 server = new ServerThread3(socket);
            new Thread(server).start();
        }
    }
}
class ServerThread3 implements Runnable{
    private Socket socket;

    public ServerThread3(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println("客户端"+ socket.getInetAddress()+"连接成功！");
        String info = "Good morning Java";
        OutputStream outputStream = null;
        try {
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintStream printStream = new PrintStream(outputStream);
        printStream.print(info);
        printStream.close();

    }
}
