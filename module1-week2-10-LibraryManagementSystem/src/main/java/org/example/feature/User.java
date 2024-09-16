package org.example.feature;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<LibraryMaterial> borrowedMaterials;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.borrowedMaterials = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void borrowMaterial(LibraryMaterial material) {
        if (material.isAvailable()) {
            material.borrow();
            borrowedMaterials.add(material);
        } else {
            System.out.println("The material is not available.");
        }
    }

    public void returnMaterial(LibraryMaterial material) {
        if (borrowedMaterials.contains(material)) {
            material.returnMaterial();
            borrowedMaterials.remove(material);
        } else {
            System.out.println("You haven't borrowed this material.");
        }
    }

    public void listBorrowedMaterials() {
        if(borrowedMaterials.isEmpty()) {
            System.out.println("No borrowed materials.");
        } else {
            System.out.println("Borrowed materials:");
            for (LibraryMaterial material : borrowedMaterials) {
                System.out.println("- "+ material.getTitle());
            }
        }
    }
}
