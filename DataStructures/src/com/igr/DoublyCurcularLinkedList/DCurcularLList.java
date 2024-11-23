package com.igr.DoublyCurcularLinkedList;

import java.util.Scanner;

public class DCurcularLList {
	DLLNode head;

	DLLNode prev;
	Scanner scan = new Scanner(System.in);

	void Reverse() {
		System.out.println("Reverse linkedlist is: ");
		{
			DLLNode prev = null;
			DLLNode current = head;
			while (current != null) {
				DLLNode temp = current.next;
				current.next = prev;
				prev = current;
				current = temp;

			}
			head = prev.next;
		}
	}

	void deleteAtMiddle() {
		if (head == null) {
			System.out.println("linkedlist is empty:");
			return;
		} else {
			DLLNode temp = head;
			System.out.println("enter index where u want to delete :");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("linkedlist is empty:");
			return;
		} else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}

	void deleteAtFirst() {
		System.out.println("delete first element:");
		if (head == null) {
			System.out.println("Linkedlist is empty:");

		} else {
			head.prev.next = head.next;
			head = head.next;
			head.prev = head.prev.prev;
		}
	}

	void insertAtMiddle(int data) {
		DLLNode newnode = new DLLNode();
		newnode.data = data;
		DLLNode temp = head;
		System.out.println("inter index");
		if (head == null) {
			newnode.next = head;
			newnode.prev = head;
		}
		int index = scan.nextInt();
		System.out.println("insert element at middle:");
		for (int i = 1; i < index - 1; i++) {
			temp = temp.next;
		}
		temp.next.prev = newnode;
		newnode.next = temp.next;
		newnode.prev = temp;
		temp.next = newnode;
	}

	void insertAtLast(int data) {
		DLLNode newnode = new DLLNode();
		newnode.data = data;
		System.out.println("inserting element at last :");
		if (head == null) {
			head = newnode;
			newnode.next = head;
			newnode.prev = head;
		} else {
			head.prev.next = newnode;
			head.prev = newnode;
			// newnode.prev = head.prev;
			newnode.next = head;

		}

	}

	void insertAtFirst(int data) {
		DLLNode newnode = new DLLNode();
		newnode.data = data;
		System.out.println("inserting elemrnt at first :");
		if (head == null) {
			head = newnode;
			newnode.next = head;
			newnode.prev = head;

		} else {
			head.prev.next = newnode;
			newnode.prev = head.prev;
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}

	void show() {
		System.out.println("DcurcularLList is : ");
		if (head == null) {
			System.out.println("Dlinkedlist is empty");
			return;
		}
		DLLNode temp = head;
		do {
			System.out.println(temp.data + "  ");
			temp = temp.next;
		} while (temp != head);
		System.out.println();
	}
}
