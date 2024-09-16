package org.example;

import org.example.feature.*;
import org.example.feature.UserManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        // library material
        LibraryMaterial book1 = new Book("The Great Gatsby", 3);
        LibraryMaterial magazine1 = new Magazine("Time Magazine", 2);
        LibraryMaterial dvd1 = new DVD("Inception", 1);

        // user interactions
        boolean running = true;
        while (running) {
            System.out.println("\nMenu: ");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Borrow Material");
            System.out.println("4. Return Material");
            System.out.println("5. List Borrowed Materials");
            System.out.println("6. Check Material Availability");
            System.out.println("7. Logout");
            System.out.println("8. Exit");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.println("Enter password: ");
                    String password = scanner.nextLine();
                    userManager.register(username, password);
                    break;

                case 2:
                    System.out.println("Enter username: ");
                    username = scanner.nextLine();
                    System.out.println("Enter password: ");
                    password = scanner.nextLine();
                    userManager.login(username, password);
                    break;

                case 3:
                    if (userManager.getLoggedInUser() != null) {
                        System.out.println("Choose material to borrow:");
                        System.out.println("1. "+ book1.getTitle());
                        System.out.println("2. "+ magazine1.getTitle());
                        System.out.println("3. "+ dvd1.getTitle());
                        int materialChoice = scanner.nextInt();
                        LibraryMaterial selectedMaterial = null;

                        if (materialChoice == 1) {
                            selectedMaterial = book1;
                        } else if (materialChoice == 2) {
                            selectedMaterial = magazine1;
                        } else if (materialChoice == 3) {
                            selectedMaterial = dvd1;
                        }

                        if (selectedMaterial != null) {
                            userManager.getLoggedInUser().borrowMaterial(selectedMaterial);
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    } else {
                        System.out.println("You need to log in first.");
                    }
                    break;

                case 4:
                    if (userManager.getLoggedInUser() != null) {
                        System.out.println("Choose material to return: ");
                        System.out.println("1. "+ book1.getTitle());
                        System.out.println("2. "+ magazine1.getTitle());
                        System.out.println("3. "+ dvd1.getTitle());
                        int returnChoice = scanner.nextInt();
                        LibraryMaterial returnMaterial = null;

                        if (returnChoice == 1) {
                            returnMaterial = book1;
                        } else if (returnChoice == 2) {
                            returnMaterial = magazine1;
                        } else if (returnChoice == 3) {
                            returnMaterial = dvd1;
                        }

                        if (returnMaterial != null) {
                            userManager.getLoggedInUser().returnMaterial(returnMaterial);
                        } else {
                            System.out.println("Invalid choice.");
                        }
                    } else {
                        System.out.println("You need to log in first");
                    }
                    break;

                case 5:
                    if (userManager.getLoggedInUser() != null ) {
                        userManager.getLoggedInUser().listBorrowedMaterials();
                    } else {
                        System.out.println("You need to log in first");
                    }
                    break;

                case 6:
                    System.out.println("Material Availability: ");
                    book1.printStatus();
                    magazine1.printStatus();
                    dvd1.printStatus();
                    break;

                case 7:
                    userManager.logout();
                    break;

                case 8:
                    running = false;
                    break;

                default:
                    System.out.println("invalid option.");
            }
        }
        scanner.close();
    }
}