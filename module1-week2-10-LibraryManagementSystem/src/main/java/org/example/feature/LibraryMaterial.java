package org.example.feature;

public abstract class LibraryMaterial {
    private String title;
    private int availableCount;
    private int borrowedCount;

    public LibraryMaterial(String title, int availableCount) {
        this.title = title;
        this.availableCount = availableCount;
        this.borrowedCount = 0;
    }

    public abstract void borrow();
    public abstract void returnMaterial();

    public boolean isAvailable() {
        return availableCount > 0;
    }

    public String getTitle() {
        return title;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void decreaseAvailability() {
        if (availableCount > 0) {
            availableCount--;
            borrowedCount++;
        } else {
            System.out.println("No copies available for borrowing.");
        }
    }

    public void increaseAvailability() {
        if (borrowedCount > 0) {
            availableCount++;
            borrowedCount--;
        } else {
            System.out.println("No copies were borrowed.");
        }
    }

    public void printStatus() {
        System.out.println(title + " - Available: "+ availableCount+ ", Borrowed: "+ borrowedCount);
    }
}
