import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final int port = 12345;
    private static List<User> clients = new ArrayList<>();
    private static UserManager userManager = new UserManager();


    public static void main(String[] args) {
        start();
    }

    private static void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server open!\nServer port: " + port);
            while (!serverSocket.isClosed()) {

                // AQUI ESTA O OURO! ONDE COMEÇA!!!!!!

                Socket clientSocket = serverSocket.accept();
                User user =  userManager.login(clientSocket);

                clients.add(user);
                System.out.println("User \""+user.getName()+"\" connected: " + clientSocket);


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void acceptConnection(){

    }

}
