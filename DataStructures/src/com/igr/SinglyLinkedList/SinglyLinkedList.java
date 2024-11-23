package com.igr.SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
    SLLNode head;
    Scanner scan = new Scanner(System.in);

    // Insert a node at the end of the list
    void insertLastNode(int data) {
        SLLNode newNode = new SLLNode();
        newNode.data = data;

        if (head == null) { // If the list is empty
            head = newNode;
        } else {
            SLLNode temp = head;
            while (temp.next != null) { // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode; // Attach the new node
        }
    }

    // Insert a node at the beginning of the list
    void insertFirstNode(int data) {
        SLLNode newNode = new SLLNode();
        newNode.data = data;
        newNode.next = head; // New node points to the current head
        head = newNode; // Update head to the new node
    }

    // Insert a node at a specific index
    void insertMiddleNode(int data) {
        System.out.println("Enter the index where you want to add the node:");
        int index = scan.nextInt();

        if (index < 0 || (head == null && index > 0)) { // Invalid index
            System.out.println("Invalid index.");
            return;
        }

        SLLNode newNode = new SLLNode();
        newNode.data = data;

        if (index == 0) { // Insert at the beginning
            insertFirstNode(data);
            return;
        }

        SLLNode temp = head;
        for (int i = 1; i < index; i++) {
            if (temp == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete the first node
    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            head = head.next; // Move head to the next node
            System.out.println("Node deleted from the beginning.");
        }
    }

    // Delete the last node
    void deleteLastNode() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) { // Single-node case
            head = null;
            System.out.println("Last node deleted.");
            return;
        }

        SLLNode temp = head;
        while (temp.next.next != null) { // Traverse to the second last node
            temp = temp.next;
        }

        temp.next = null; // Remove the last node
        System.out.println("Node deleted from the end.");
    }

    // Delete a node at a specific index
    void deleteRandomNode() {
        System.out.println("Enter the index of the node to delete:");
        int index = scan.nextInt();

        if (head == null || index < 0) {
            System.out.println("Invalid operation.");
            return;
        }

        if (index == 0) { // Delete the first node
            deleteFirstNode();
            return;
        }

        SLLNode temp = head;
        for (int i = 1; i < index; i++) {
            if (temp.next == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        temp.next = temp.next.next; // Remove the node
        System.out.println("Node deleted at index " + index);
    }

    // Search for a node by value
    void searchNode(int data) {
        SLLNode temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Item found at index " + index);
                return;
            }
            temp = temp.next;
            index++;
        }

        System.out.println("Item not found.");
    }

    // Reverse the list iteratively
    void reverseList() {
        SLLNode prev = null;
        SLLNode current = head;

        while (current != null) {
            SLLNode temp = current.next; // Save the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev to the current node
            current = temp; // Move current to the next node
        }

        head = prev; // Update head
        System.out.println("List reversed.");
    }

    // Display the list
    void show() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.println("Linked list:");
        SLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}