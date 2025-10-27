package day_7.oops.encapsulation;

public class User {
    public String username = "john";
    private String password = "test@123";

    // readonly -> getters
    public String getPassword() {
        return password;
    }

    // write -> setters
    public void setPassword(String password) {
        this.password = password;
    }
}
