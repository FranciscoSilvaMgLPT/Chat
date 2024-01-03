public class User {
    private String name;
    private String password;
    private Boolean admin;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        if (name.charAt(0) == '#') {
            this.admin = true;
        } else {
            this.admin = false;
        }
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
