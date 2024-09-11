package org.example;

import org.example.exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a booking system with a capacity of 5 tickets
        BookingSystem bookingSystem = new BookingSystem(5);

        // create some tickets for events
        bookingSystem.createTicket("Music Concert", 50.00);
        bookingSystem.createTicket("Art Exhibition", 30.00);
        bookingSystem.createTicket("Tech Conference", 100.00);

        // print all available tickets
        bookingSystem.printAllTickets();

        // Book a ticket by its ID
        bookingSystem.bookTicket(2, "Norman Firdaus");

        // another ticket
        bookingSystem.bookTicket(2, "Hibban");

        // book another ticket
        bookingSystem.bookTicket(3, "Hafizh");

        // Print the status of all tickets after booking
        bookingSystem.printAllTickets();
    }
}