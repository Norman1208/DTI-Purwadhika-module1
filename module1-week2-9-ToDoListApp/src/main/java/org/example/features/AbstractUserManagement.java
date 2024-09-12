package org.example.features;

import java.util.HashMap;

public abstract class AbstractUserManagement {
    protected HashMap<String, String> users = new HashMap<>();

    // Abstract methods for registration and login
    public abstract boolean register(String username, String password);
    public abstract boolean login(String username, String password);

    public HashMap<String, String> getUsers() {
        return users;
    }
}
