package org.example.exercises;

import java.util.ArrayList;

public class Event {
    private String eventName;
    private ArrayList<Ticket> tickets;

    public Event(String eventName) {
        this.eventName = eventName;
        this.tickets = new ArrayList<>();
    }

    // method to generate ticket for the event
    public void generateTickets(int numTickets, double price) {
        for (int i = 0; i < numTickets; i++) {
            tickets.add(new Ticket(eventName, price));
        }
    }

    public ArrayList<Ticket> getAvailableTickets() {
        return tickets;
    }

    public String getEventName() {
        return eventName;
    }

    public void showAvailableTickets() {
        System.out.println("Available tickets for event: "+ eventName);
        for (Ticket ticket : tickets) {
            System.out.println("Ticket ID: "+ ticket.getTicketID()+ " | Price: Rp"+ ticket.getPrice());
        }
    }

    public Ticket bookTicket() {
        if (!tickets.isEmpty()) {
            return tickets.remove(0);
        }
        System.out.println("No tickets available for this event.");
        return null;
    }
}
