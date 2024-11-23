package com.igr.SinglyCurcularLinkedLIst;

import java.util.Scanner;

import com.igr.SinglyLinkedList.SLLNode;

import java.util.Scanner;

//Assuming CLLNode is defined elsewhere in your code
public class CurcularLList {
 CLLNode head;  // Reference to the head (first node) of the circular linked list
 Scanner scan = new Scanner(System.in);  // Scanner object to read user input

 // Method to reverse the circular linked list
 void Reverse() {
     System.out.println("REVERSELIST IS:");
     
     // Initialize the necessary pointers
     CLLNode temp = head;   // temp points to the head initially
     CLLNode prev = null;   // prev starts as null (will eventually point to the previous node)
     CLLNode current = head; // current also starts at head to traverse the list
     
     if (head == null) {  // Check if the list is empty
         System.out.println("List is empty");
         return;  // Exit if the list is empty
     }
     
     // Loop through the list and reverse the links between the nodes
     do {
         temp = current.next;     // Save the reference to the next node
         current.next = prev;     // Reverse the current node's link (point it to prev)
         prev = current;          // Move prev to the current node
         current = temp;          // Move current to the next node (saved in temp)
     } while (current != head);  // Continue until we loop back to the head (circular condition)

     head.next = prev;  // Update the last node's next pointer to point to the new head
     head = prev;       // Finally, set the head to the last node (which is now the new head)
 }

 // Method to delete a node at a specific index (middle)
 void deleteAtMiddle() {
     System.out.println("Enter index:");
     CLLNode temp = head;  // Start at the head node
     int index = scan.nextInt();  // Read the index from user input

     // Traverse the list to find the node just before the one to be deleted
     for (int i = 1; i < index - 1; i++) {
         temp = temp.next;  // Move to the next node
     }
     
     // Skip the node at the index to delete it
     temp.next = temp.next.next;
 }

 // Method to delete the first node in the list
 void deleteAtFirst() {
     System.out.println("Deleting first element");

     if (head == null) {  // If the list is empty, do nothing
         System.out.println("List is empty");
         return;
     }

     // Traverse to the last node to update its 'next' pointer
     CLLNode temp = head;
     while (temp.next != head) {  // Keep going until the last node is reached
         temp = temp.next;
     }

     head = head.next;  // Move the head to the second node
     temp.next = head;  // Update the last node's next pointer to the new head
 }

 // Method to delete the last node in the list
 void deleteAtLast() {
     System.out.println("Deleting last element:");

     if (head == null) {  // If the list is empty, do nothing
         System.out.println("List is empty");
         return;
     }

     // Traverse to the second-last node to update its 'next' pointer
     CLLNode temp = head;
     while (temp.next.next != head) {  // Stop when we are at the second-to-last node
         temp = temp.next;
     }
     temp.next = head;  // Remove the last node by updating the second-to-last node's next pointer
 }

 // Method to insert a new node at a given location
 void insertAtGivenLoc(int data) {
     CLLNode newnode = new CLLNode();  // Create a new node
     newnode.data = data;  // Set the data of the new node
     CLLNode temp = head;
     
     System.out.println("Enter element location:");
     int loc = scan.nextInt();  // Get the desired location from user input
     
     // Traverse to the node before the given location
     for (int i = 0; i < loc - 1; i++) {
         temp = temp.next;
     }
     
     // Insert the new node at the given location
     newnode.next = temp.next;  // Make newnode point to the node at the location
     temp.next = newnode;  // Make the previous node point to the new node
 }

 // Method to insert a new node in the middle of the list
 void insertAtMiddle(int data) {
     CLLNode newnode = new CLLNode();
     newnode.data = data;  // Set the data for the new node
     CLLNode temp = head;
     
     System.out.println("Insert element at middle:");
     int index = scan.nextInt();  // Get the index where the new node will be inserted
     
     // Traverse to the node before the given index
     for (int i = 0; i < index - 1; i++) {
         temp = temp.next;
     }

     // Insert the new node at the middle location
     newnode.next = temp.next;
     temp.next = newnode;
 }

 // Method to insert a new node at the end (last) of the list
 void insertAtLast(int data) {
     CLLNode newnode = new CLLNode();  // Create a new node
     newnode.data = data;  // Set the data for the new node
     
     System.out.println("Inserting element at last");

     if (head == null) {  // If the list is empty, make the new node both the head and the tail
         head = newnode;
         head.next = newnode;  // Point the new node's next pointer to itself (making it circular)
     } else {
         CLLNode temp = head;
         while (temp.next != head) {  // Traverse to the last node
             temp = temp.next;
         }
         temp.next = newnode;  // Make the last node point to the new node
         newnode.next = head;  // Make the new node point back to the head (circular link)
     }
 }

 // Method to insert a new node at the beginning (first) of the list
 void insertAtFirst(int data) {
     CLLNode newnode = new CLLNode();  // Create a new node
     newnode.data = data;  // Set the data for the new node
     
     System.out.println("Inserting element at beginning");

     if (head == null) {  // If the list is empty, make the new node both the head and the tail
         head = newnode;
         newnode.next = head;  // Point the new node's next pointer to itself (circular link)
     } else {
         CLLNode temp = head;
         while (temp.next != head) {  // Traverse to the last node
             temp = temp.next;
         }

         temp.next = newnode;  // Make the last node point to the new node
         newnode.next = head;  // Point the new node's next to the head
         head = newnode;  // Make the new node the head of the list
     }
 }

 // Method to display the list
 void show() {
     if (head == null) {  // If the list is empty, print a message
         System.out.println("List is empty");
         return;
     }
     
     // Print the data of each node in the list
     CLLNode temp = head;
     do {
         System.out.print(temp.data + " ");  // Print the data of the current node
         temp = temp.next;  // Move to the next node
     } while (temp != head);  // Continue until we loop back to the head
     
     System.out.println();  // Print a newline at the end
 }
}
