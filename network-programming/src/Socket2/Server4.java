package Socket2;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 服务端向客户端发送非文本数据-Server
 * @author 黄敬理
 *2019.05.09
 */
public class Server4 {
    public static void main(String[] args)throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        System.out.println("服务器启动...");
        while (true){
            Socket socket = ss.accept();
            ServerThread4 st = new ServerThread4();
            st.setSocket(socket);
            Thread thread = new Thread(st);
            thread.start();
        }
    }
}
class ServerThread4 implements Runnable{
    private Socket socket;
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        System.out.println("客户端" + socket.getInetAddress() + "连接成功...");
        try{
            File file = new File("D:/image/11.png");
            InputStream in = new FileInputStream(file);
            byte[] bytes = new byte[(int) file.length()];
            in.read(bytes);
            OutputStream out = socket.getOutputStream();
            out.write(bytes);
            in.close();
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
