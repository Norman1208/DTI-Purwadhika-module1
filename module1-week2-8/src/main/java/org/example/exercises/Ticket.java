package org.example.exercises;

public class Ticket implements Ticketable{
    // private fields (encapsulation)
    private double ticketID;
    private String eventName;
    private double price;
    private static int ticketCounter = 1000; // unique ticket ID generator

    public Ticket(String eventName, double price) {
        this.ticketID = ticketCounter++; //unique ticket ID based on static counter
        this.eventName = eventName;
        this.price = price;
    }

    // Getter methods (encapsulation)
    public double getTicketID() {
        return ticketID;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    // implementing method fro printableTicket interface
    @Override
    public void printTicketDetails() {
        System.out.println("==============================");
        System.out.println("     TICKET INFORMATION       ");
        System.out.println("==============================");
        System.out.println("Ticket ID: "+ ticketID);
        System.out.println("Event Name: "+ eventName);
        System.out.println("Price: Rp." + price);
        System.out.println("==============================");
    }
}

