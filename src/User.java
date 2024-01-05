import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class User {
    private String name;
    private String password;
    private Boolean admin;
    private Boolean chat;
    private Socket userSocket;
    private BufferedReader reader;
    private PrintWriter writer;

    public User(String name, String password, Socket userSocket) {
        this.name = name;
        this.password = password;
        this.chat = false;
        if (name.charAt(0) == '#') {
            this.admin = true;
        } else {
            this.admin = false;
        }
     /*
           <<< NEEDS STUDY >>>

        this.userSocket = userSocket;
        try {
            this.reader = new BufferedReader(new InputStreamReader(userSocket.getInputStream()));
            this.writer = new PrintWriter(userSocket.getOutputStream(), true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
