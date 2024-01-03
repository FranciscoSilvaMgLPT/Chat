public class User {
    String name;
    String password;
    Boolean admin;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.admin = false;
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
