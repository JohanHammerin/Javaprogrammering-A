package se.johan_hammerin.Lektion_6.Övning_2;

public class User {
    private String username;
    private String password;

    //Constructor
    User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    //getters & setters
    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
