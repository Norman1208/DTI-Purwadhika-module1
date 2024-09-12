package org.example;

import org.example.exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventOrganizer organizer = new EventOrganizer();
        System.out.println("Please input your name: ");
        String name = scanner.nextLine();
        User user = new User(name);
        boolean exit = false;

        while (!exit) {
            System.out.println("---Ticket Booking System---");
            System.out.println("1. Organizer: Create Event & Add Tickets");
            System.out.println("2. User: Book Ticket");
            System.out.println("3. user: confirm Booking");
            System.out.println("4. User: List Confirmed Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Event Name: ");
                    String eventName = scanner.nextLine();
                    organizer.createEvent(eventName);
                    System.out.print("Enter the number of tickets: ");
                    int numTickets = scanner.nextInt();
                    System.out.print("Enter the ticket price: ");
                    double price = scanner.nextDouble();
                    organizer.addTicketsToEvent(eventName, numTickets, price);
                    break;

                case 2:
                    organizer.showAllEvents();
                    System.out.print("Enter Event Name: ");
                    eventName = scanner.nextLine();
                    Event event = organizer.getEvent(eventName);
                    if (event != null) {
                        user.bookTicket(event);
                    } else {
                        System.out.println("Event not found.");
                    }
                    break;

                case 3:
                    user.showUnconfirmedBookings();
                    System.out.print("Enter index to confirm: ");
                    int index = scanner.nextInt();
                    user.confirmBooking(index);
                    break;

                case 4:
                    user.showConfirmedBookings();
                    break;

                case 5:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
        scanner.close();
    }
}