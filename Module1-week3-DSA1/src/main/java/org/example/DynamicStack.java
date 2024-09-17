package org.example;


import org.w3c.dom.ls.LSOutput;

// stack class using a linked list with Nodes an inner class
public class DynamicStack<T> {
    // inner class node to represent each node in the linked list
    private class Node<T> {
        T data;
        Node<T> next;

        // constructor to initialize a node with data
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> top; // top of the stack (head)

    // constructor to initialize an empty stack
    public DynamicStack() {
        this.top = null;
    }

    // method to push an element onto the stack
    public void push(T data) {
        Node<T> newNode = new Node<>(data); // create a new node with the data
        newNode.next = top; // link the new node to the current top
        top = newNode; // update the top to point to the new node
        System.out.println("Pushed "+ data + " to the stack.");
    }

    // method to check if the stack is empty
    public boolean isEmpty() {
        return this.top == null;
    }

    // method to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        T poppedData = top.data; // store the data to e return
        top = top.next;
        System.out.println("Popped "+ poppedData+ " from the stack.");
        return poppedData;
    }

    // method to p eek at the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return top.data;
    }

    // method to print the stack elements for debugging
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node<T> currentNode = top;
        System.out.println("Stack: ");
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

}
