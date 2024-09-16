package org.example.feature;

public class DVD extends LibraryMaterial{
    public DVD(String title, int availableCount) {
        super(title, availableCount);
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            decreaseAvailability();
            System.out.println("Borrowed the DVD: "+ getTitle());
        } else {
            System.out.println("DVD not available for borrowing: "+ getTitle());
        }

    }

    @Override
    public void returnMaterial() {
        increaseAvailability();
        System.out.println("Returned the DVD: " + getTitle());
    }
}
