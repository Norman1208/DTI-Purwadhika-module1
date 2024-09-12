package org.example.features;

import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Task> todoList;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.todoList = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    // task management Methods
    public void addTask(String description) {
        Task newTask = new Task(description);
        todoList.add(newTask);
        System.out.println("Task added: "+ description);
    }

    public void viewTasks() {
        if (todoList.isEmpty()) {
            System.out.println("Your to-do list is empty.");
        } else {
            System.out.println("Your To-Do List:");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i+1)+ ". "+ todoList.get(i).getDescription());
            }
        }
    }

    public void deleteTask(int index) {
        if (index > 0 && index <= todoList.size()) {
            Task removedTask = todoList.remove(index - 1);
            System.out.println("Task deleted: "+ removedTask.getDescription());
        } else {
            System.out.println("Invalid task number.");
        }
    }
}
