package org.example.exercises;

import java.util.ArrayList;

public class User {
    private String username;
    private ArrayList<BookingSystem> bookings;

    public User(String username) {
        this.username = username;
        this.bookings = new ArrayList<>();
    }

    public void bookTicket(Event event) {
        Ticket ticket = event.bookTicket();
        if (ticket != null) {
            BookingSystem booking = new BookingSystem(ticket);
            bookings.add(booking);
            System.out.println("Ticket booked. Waiting for confirmation.");
        }
    }

    public void confirmBooking(int index) {
        if (index >= 0 && index < bookings.size()) {
            bookings.get(index).confirm();
        }
    }

    public void cancelBooking(int index) {
        if (index >= 0 && index < bookings.size()) {
            bookings.get(index).cancel();
            bookings.remove(index);
        }
    }

    public void showUnconfirmedBookings() {
        System.out.println("Unconfirmed Bookings:");
        for (int i = 0; i < bookings.size(); i++) {
            if (!bookings.get(i).isConfirmed()) {
                System.out.println(i + ". Ticket ID: " + bookings.get(i).getTicket().getTicketID());
            }
        }
    }

    public void showConfirmedBookings() {
        System.out.println("Confirmed Bookings:");
        for (BookingSystem booking : bookings) {
            if (booking.isConfirmed()) {
                booking.printBookingDetail();
            }
        }
    }
}
