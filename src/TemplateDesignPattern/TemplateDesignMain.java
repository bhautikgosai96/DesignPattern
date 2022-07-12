package TemplateDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TemplateDesignMain {

    public static void main(String[] args) throws IOException {
        Network network = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Username: ");
        String username = reader.readLine();
        System.out.println("Enter Password: ");
        String password = reader.readLine();

        System.out.println("Enter Message: ");
        String message = reader.readLine();

        System.out.println("Choose below social network:");
        System.out.println("1 -> Facebook");
        System.out.println("2 -> Twitter");
        Integer choice = Integer.parseInt(reader.readLine());

        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        } else {
            System.out.println("Opps, you selected wrong choice...");
        }
        network.post(message);
    }
}
