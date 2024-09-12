package org.example.exercises;

public class BookingSystem {
    private Ticket ticket;
    private boolean confirmed;

    // constructor to initialize the booking system with a ticket capacity
    public BookingSystem(Ticket ticket) {
        this.ticket = ticket;
        this.confirmed = false;
    }

    public void confirm() {
        confirmed = true;
        System.out.println("Booking confirmed for Ticket ID: "+ ticket.getTicketID());
    }

    public void cancel() {
        System.out.println("Booking cancelled for Ticket ID: " + ticket.getTicketID());
        confirmed = false;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void printBookingDetail() {
        System.out.println("Booking Details:");
        System.out.println("Ticket ID: "+ ticket.getTicketID());
        System.out.println("Event Name: "+ ticket.getEventName());
        System.out.println("confirmed: " + confirmed);
    }

    public Ticket getTicket() {
        return ticket;
    }
}
