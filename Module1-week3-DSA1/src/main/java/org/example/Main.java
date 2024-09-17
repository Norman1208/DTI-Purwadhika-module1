package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linked list or binary search");
        System.out.println("Choose the option");
        System.out.println("1. Linked list");
        System.out.println("2. Binary search");
        System.out.println("3. Exit");
        System.out.print("input the option: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        switch (input) {
            case 1:
                DynamicStack<Integer> stack = new DynamicStack<>();

                // push element into the stack
                stack.push(10);
                stack.push(20);
                stack.push(30);

                //print the stack
                stack.printStack();

                // peek at the top element
                System.out.println("Top element is: "+ stack.peek());

                // pop element from the stack
                stack.pop();
                stack.pop();

                // print the stack
                stack.printStack();

                // attempt to pop from an empty stack
                stack.pop();
                try {
                    stack.pop();
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                }
                break;

            case 2:
                BinarySearchTree bst = new BinarySearchTree();

                // inserting N numbers into the BST
                System.out.println("Enter the number of elements to insert into the BST:");
                int n = scanner.nextInt();
                System.out.println("Enter "+ n + " numbers: ");
                for (int i = 0 ; i<n ; i++) {
                    int number = scanner.nextInt();
                    bst.insert(number);
                }

                System.out.println("In-order traversal of the BST:");
                bst.inorderTraversal();

                // loop for continuous searching until the user decides to exit
                String command;
                do {
                    System.out.println("Enter a number to search for in the BST (or type 'exit' to stop): ");
                    command = scanner.next();

                    if (!command.equalsIgnoreCase("exit")) {
                        try {
                            int searchNumber = Integer.parseInt(command);
                            if (bst.search(searchNumber)) {
                                System.out.println(searchNumber + " is found in the BST.");
                            } else {
                                System.out.println(searchNumber + "is not found in the BST.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input! Please enter a valid number or type 'exit' to stop.");
                        }
                    }
                } while (!command.equalsIgnoreCase("exit"));

                System.out.println("Exiting the program. Goodbye!");
                scanner.close();
        }
    }
}