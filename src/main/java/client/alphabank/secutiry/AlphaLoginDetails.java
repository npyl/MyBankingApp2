package client.alphabank.secutiry;

public class AlphaLoginDetails {

    private String username;
    private String password;

    public AlphaLoginDetails(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
