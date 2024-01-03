import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final int port = 12345;
    private static List<User> clients = new ArrayList<>();
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Connected to server port: " + port);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
