package org.example.exercises;

import java.util.ArrayList;

public class EventOrganizer {
    private ArrayList<Event> events;

    public EventOrganizer() {
        this.events = new ArrayList<>();
    }

    public void createEvent(String eventName) {
        events.add(new Event(eventName));
        System.out.println("Event created: "+ eventName);
    }

    public void addTicketsToEvent(String eventName, int numberOfTickets, double price) {
        for (Event event : events) {
            if (event.getEventName().equalsIgnoreCase(eventName)) {
                event.generateTickets(numberOfTickets, price);
                System.out.println("Tickets added to event: "+ eventName);
                return;
            }
        }
        System.out.println("Event not found.");
    }

    public Event getEvent(String eventName) {
        for (Event event: events) {
            if (event.getEventName().equalsIgnoreCase(eventName)) {
                return event;
            }
        }
        return null;
    }

    public void showAllEvents() {
        System.out.println("Available Events: ");
        for (Event event : events) {
            System.out.println(event.getEventName());
        }
    }
}

