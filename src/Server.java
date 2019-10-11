

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8944);
            Socket s = serverSocket.accept();
            OutputStream outputStream = s.getOutputStream();
            outputStream.write("来自服务器的消息\n".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
