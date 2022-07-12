package TemplateDesignPattern;

public class Twitter extends Network {

    public Twitter(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    boolean isLogin(String username, String password) {
        System.out.println("Username: "+username);
        System.out.print("Password: ");
        for(int i = 0; i<password.length();i++){
            System.out.print("*");
        }
        System.out.println("\nUser "+username+" has logged in to Twitter.");
        return true;
    }

    @Override
    boolean sendMessage(String message) {
        System.out.println("\nMessage sent from Twitter...... -> "+message);
        return true;
    }

    @Override
    boolean logOut() {
        System.out.println("\nUser "+username+" has log out to Twitter.");
        return true;
    }
}
