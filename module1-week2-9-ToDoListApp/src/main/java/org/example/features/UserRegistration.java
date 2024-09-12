package org.example.features;

public class UserRegistration extends AbstractUserManagement {
    @Override
    public boolean register(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists.");
            return false;
        }
        users.put(username, password);
        System.out.println("Registration successful!");
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Login functionality not handled by registration class.");
        return false;
    }
}
