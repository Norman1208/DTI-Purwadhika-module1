package org.example.feature;

public class Magazine extends LibraryMaterial{
    public Magazine(String title, int availableCount) {
        super(title, availableCount);
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            decreaseAvailability();
            System.out.println("Borrowed the Magazine: "+ getTitle());
        } else {
            System.out.println("Magazine not available for borrowing: "+ getTitle());
        }
    }

    @Override
    public void returnMaterial() {
        increaseAvailability();
        System.out.println("Returned the Magazine: "+ getTitle());
    }
}
