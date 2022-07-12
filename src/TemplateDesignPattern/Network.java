package TemplateDesignPattern;

public abstract class Network {

    String username;
    String password;

    public void post(String message) {
        if (isLogin(this.username, this.password)) {
            sendMessage(message);
            logOut();
        }
    }

    abstract boolean isLogin(String username, String password);

    abstract boolean sendMessage(String message);

    abstract boolean logOut();

}
