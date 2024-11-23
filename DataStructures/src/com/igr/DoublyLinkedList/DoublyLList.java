package com.igr.DoublyLinkedList;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;

public class DoublyLList {
    DLLNode head;  // Reference to the head node of the doubly linked list
    DLLNode tail;  // Reference to the tail node of the doubly linked list
    Scanner scan = new Scanner(System.in);  // Scanner for user input

    // Insert a node at the beginning of the list
    void InsertAtFirst(int data) {
        DLLNode newnode = new DLLNode();  // Create a new node
        newnode.data = data;  // Set the data for the new node
        if (head == null) {  // If list is empty, set head to the new node
            head = newnode;
        } else {
            head.prev = newnode;  // Link the new node to the start of the list
            newnode.next = head;
            head = newnode;  // Update head to the new node
        }
    }

    // Insert a node at the end of the list
    void InsertAtLast(int data) {
        DLLNode newnode = new DLLNode();
        newnode.data = data;
        if (head == null) {  // If list is empty, insert at beginning
            InsertAtFirst(data);
            head = newnode;
        }
        DLLNode temp = head;
        while (temp.next != null) {  // Traverse to the last node
            temp = temp.next;
        }
        temp.next = newnode;  // Link the last node to the new node
        newnode.prev = temp;
    }

    // Insert a node at a specific index provided by the user
    void InsertAtRandom(int data) {
        DLLNode newnode = new DLLNode();
        newnode.data = data;
        DLLNode temp = head;
        System.out.println("enter index where u want to add element");
        int index = scan.nextInt();
        for (int i = 0; i < index - 1; i++) {  // Traverse to the specified index
            temp = temp.next;
        }
        newnode.next = temp.next;  // Insert the new node at the specified index
        temp.next = newnode;
    }

    // Delete the first node in the list
    void DeleteAtBeging(int data) {
        if (head == null) {  // If list is empty, display message
            System.out.println("Doubly linkedlist is empty");
        } else {
            head = head.next;  // Move head to the next node
            if (head != null) {
                head.prev = null;  // Update previous link of the new head
            }
            System.out.println("deletion done at beginning");
        }
    }

    // Delete the last node in the list
    void DeletionAtLast(int data) {
        DLLNode temp = head;
        if (head == null) {  // If list is empty, display message
            System.out.println("DLinkedlist is empty");
        }
        while (temp.next.next != null) {  // Traverse to the second last node
            temp = temp.next;
        }
        System.out.println("deletion done at last");
        temp.next = null;  // Remove the link to the last node
        temp.prev = null;
    }

    // Delete a node at a specified index provided by the user
    void DeletionAtRandom(int data) {
        DLLNode temp = head;
        System.out.println("enter index where you want to delete element");
        int index = scan.nextInt();
        for (int i = 1; i < index - 1; i++) {  // Traverse to the node at the specified index
            temp = temp.next;
        }
        temp.next = temp.next.next;  // Update links to remove the node
        temp.prev = null;
    }

    // Find a node by its position
    void FindNode() {
        DLLNode temp = head;
        System.out.println("enter the element loc: ");
        int loc = scan.nextInt();
        int i = 0;
        
        while (temp != null) {
            if (i == loc) {
                System.out.println("element found :" + temp.data);
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    // Find the location of a node by its data
    void ElementOfLoc(int data) {
        DLLNode temp = head;
        System.out.println("searching for the data: " + data);
        int i = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println(" Data: " + temp.data + " found at index: " + i);
                return;
            }
            temp = temp.next;
            i++;
        }
    }

    // Reverse the doubly linked list
    void ReverseLL() {
        System.out.println("reversing linked list:");
        DLLNode prev = null;
        DLLNode current = head;
        while (current != null) {
            DLLNode temp = current.next;
            current.next = prev;  // Reverse the link
            prev = current;
            current = temp;
        }
        head = prev;  // Update head to the last node
    }

    // Display the list elements
    void display() {
        DLLNode temp = head;
        System.out.println("the DoublyLinkedList is: ");
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}


