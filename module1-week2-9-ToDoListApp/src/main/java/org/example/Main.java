package org.example;

import org.example.features.*;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, User> users = new HashMap<>();
        boolean exit = false;
        User loggedInUser = null;

        while (!exit) {
            System.out.println("\n--- User Management System ---");
            if (loggedInUser == null) {
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.println("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        if (!users.containsKey(username)) {
                            users.put(username, new User(username, password));
                            System.out.println("Registration successful!");
                        } else {
                            System.out.println("Username already exists.");
                        }
                        break;

                    case 2:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        password = scanner.nextLine();
                        User user = users.get(username);
                        if (user != null && user.checkPassword(password)) {
                            loggedInUser = user;
                            System.out.println("Login successful! Welcome" + username);
                        } else {
                            System.out.println("Invalid username or password");
                        }
                        break;

                    case 3:
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid Option.");
                }
            } else {
                System.out.println("\n--- Task Management ---");
                System.out.println("1. Add Task");
                System.out.println("2. View To-do List");
                System.out.println("3. Delete Task");
                System.out.println("4. Logout");
                System.out.print("Choose the Option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String taskDescription = scanner.nextLine();
                        loggedInUser.addTask(taskDescription);
                        break;

                    case 2:
                        loggedInUser.viewTasks();
                        break;

                    case 3:
                        loggedInUser.viewTasks();
                        System.out.print("Enter task number to delete: ");
                        int taskIndex = scanner.nextInt();
                        loggedInUser.deleteTask(taskIndex);
                        break;

                    case 4:
                        loggedInUser = null;
                        System.out.println("Logged out.");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
        scanner.close();
    }
}