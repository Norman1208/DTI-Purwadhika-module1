package org.example.exercises;

public class BookingSystem {
    private Ticket[] tickets;
    private int ticketCapacity;
    private int ticketsSold;

    // constructor to initialize the booking system with a ticket capacity
    public BookingSystem(int capacity) {
        this.ticketCapacity = capacity;
        this.tickets = new Ticket[capacity];
        this.ticketsSold = 0;
    }

    // Method to create a new ticket for an event
    public void createTicket(String eventName, double price) {
        if (ticketsSold < ticketCapacity) {
            Ticket newTicket = new Ticket(eventName, price);
            tickets[ticketsSold] = newTicket;
            ticketsSold++;
            System.out.println("Ticket created for event: "+ eventName+" with price: $"+ price);
        } else {
            System.out.println("Ticket capacity reached. Cannot create more tickets.");
        }
    }

    // method to book a ticket by ticket ID
    public void bookTicket(int ticketID, String userName) {
        Ticket ticket = findTicketByID(ticketID);
        if (ticket != null) {
            if (!ticket.isBooked()) {
                ticket.bookTicket();
                System.out.println("Confirmation: Ticket booked for "+ userName);
            } else {
                System.out.println("Sorry, this ticket has already been booked.");
            }
        } else {
            System.out.println("Ticket with ID"+ ticketID + " not found.");
        }
    }

    // method to find a ticket by ID
    private Ticket findTicketByID(int ticketID){
        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.getTicketID() == ticketID){
                return ticket;
            }
        }
        return null;
    }

    // method to print details of all tickets
    public void printAllTickets() {
        System.out.println("All tickets:");
        for (Ticket ticket : tickets) {
            if (ticket != null) {
                ticket.printTicketDetails();
                System.out.println();
            }
        }
    }
}
