package Socket2;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server7 extends JFrame implements Runnable {
    private Socket s = null;
    private ServerSocket ss = null;
    private ArrayList clients = new ArrayList();

    public Server7() throws Exception {
        this.setTitle("服务器端");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBackground(Color.YELLOW);
        this.setSize(500, 400);
        this.setLocation(200,200);
        this.setVisible(true);
        ss = new ServerSocket(9999);
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                s = ss.accept();
                ChatThread ct = new ChatThread(s);
                clients.add(ct);
                ct.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class ChatThread extends Thread {
        private Socket s = null;
        private BufferedReader br = null;
        public PrintStream ps = null;

        public ChatThread(Socket s) throws Exception {
            this.s = s;
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            ps = new PrintStream(s.getOutputStream());
        }

        public void run() {
            try {
                while (true) {
                    String str = br.readLine();
                    sendMessage(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String msg) {
        for (int i = 0; i < clients.size(); i++) {
            ChatThread ct = (ChatThread) clients.get(i);
            ct.ps.println(msg);
        }
    }

    public static void main(String[] args) throws Exception {
        Server7 server7 = new Server7();
    }
}