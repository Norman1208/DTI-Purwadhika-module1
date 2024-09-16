package org.example.feature;

public class Book extends LibraryMaterial{
    public Book(String title, int availableCount) {
        super(title, availableCount);
    }

    @Override
    public void borrow() {
        if (isAvailable()) {
            decreaseAvailability();
            System.out.println("Borrowed the book: "+ getTitle());
        } else {
            System.out.println("Book not available for borrowing: "+ getTitle());
        }
    }

    @Override
    public void returnMaterial() {
        increaseAvailability();
        System.out.println("Returned the book: "+ getTitle());
    }
}
