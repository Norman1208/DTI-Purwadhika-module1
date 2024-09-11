package org.example.exercises;

public class Ticket implements Ticketable{
    private static int ticketCount = 0; // static variable to track the total ticket created
    private double ticketID;
    private String eventName;
    private double price;
    private boolean isBooked;

    public Ticket(String eventName, double price) {
        this.ticketID = ++ticketCount; //unique ticket ID based on static counter
        this.eventName = eventName;
        this.price = price;
        this.isBooked = false; // initially, the ticket is not booked
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

    public boolean isBooked() {
        return isBooked;
    }

    // method to book ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket ID:" + ticketID + " for event" + eventName + " has been successfully booked");
        } else {
            System.out.println("Ticket ID: "+ ticketID+ " is already booked.");
        }
    }

    //print ticket detail

    @Override
    public void printTicketDetails() {
        System.out.println("Ticket ID: "+ ticketID);
        System.out.println("Event Name: "+ eventName);
        System.out.println("Price: $" + price);
        System.out.println("Booked: "+ (isBooked? "Yes": "No"));
    }
}

