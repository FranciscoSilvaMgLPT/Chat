import java.net.Socket;

public class UserManager {
    public User login(Socket socket) {



        try {
            return new User("O NOME", "PASS", socket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public User signUp() {


        return null;
    }

    public void enterChat(User user) {


    }


}
