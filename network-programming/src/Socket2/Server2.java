package Socket2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

/**
 * 客户端向服务器发送非文本数据-server端
 */
public class Server2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        System.out.println("服务器启动");
        Socket socket;
        while (true){
            socket = serverSocket.accept();
            ServerThread2 st2 = new ServerThread2();
            st2.setSocket(socket);
            Thread thread = new Thread(st2);
            thread.start();
        }
    }
}
class ServerThread2 implements Runnable{
private Socket socket;

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("客户端" + socket.getInetAddress() + "连接成功");
        try{
            InputStream inputStream = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            File file = new File("D:/test/" + UUID.randomUUID().toString() + ".jpg");
            OutputStream os = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(os);
            byte[] data = new byte[1024];
            int tmp;
            while ((tmp = bis.read(data)) != -1){
                bos.write(data,0,tmp);
            }
            bos.close();
            bis.close();
            socket.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}