package org.example.feature;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;
    private User loggedInUser;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists. Try a difference one.");
                return;
            }
        }
        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }

    public void login(String username, String password) {
        for (User user: users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                loggedInUser = user;
                System.out.println("Login successful! Welcome, "+ username);
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void logout() {
        if (loggedInUser != null) {
            System.out.println("Logged out successfully.");
            loggedInUser = null;
        } else {
            System.out.println("No user is currently logged in");
        }
    }
}
