package org.example.features;

import java.util.HashMap;

public class UserLogin extends AbstractUserManagement{
    private HashMap<String, String> users;

    public UserLogin(HashMap<String, String> users) {
        this.users = users;
    }

    @Override
    public boolean register(String username, String password) {
        System.out.println("Registration functionality not handled by login class.");
        return false;
    }

    @Override
    public boolean login(String username, String password) {
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            return true;
        }
        System.out.println("Invalid username or password");
        return false;
    }
}
