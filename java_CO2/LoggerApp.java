class User {
    private String password;
    protected String role;
    public String username;
    public final static String SYSTEM_NAME = "AccessLogger";

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public void showUserDetails() {
        System.out.println("System: " + SYSTEM_NAME);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
    }
}

public class LoggerApp {
    public static void main(String[] args) {
        User u = new User("Alice", "pass123", "Admin");

        System.out.println("Direct Access Username: " + u.username);
        System.out.println("Direct Access SYSTEM_NAME: " + User.SYSTEM_NAME);

        u.showUserDetails();
    }
}
