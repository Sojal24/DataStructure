package com.igr.HashTable;

import java.util.Scanner;

import com.igr.SinglyLinkedList.SLLNode;

public class HashTable {

	HashNode head;
	HashNode[] hs = new HashNode[16];

	public static void main(String[] args) {
		HashTable ht = new HashTable();
		Scanner scan = new Scanner(System.in);

		ht.add(52);
		ht.display();
		ht.add(76);
		ht.display();
		ht.add(83);
		ht.display();
		ht.add(88);
		ht.display();
		ht.add(34);
		ht.display();
		ht.search(8);
		ht.display();
		ht.Remove(88);
		ht.display();
	}

	void Remove(int data) {
		int index = data % 16;
		HashNode current = hs[index];		//1. declare current
		HashNode prev = null;
		while (current != null) {
			if (current.data == data) {

				if (prev == null) {
					hs[index] = current.next;
				} else {
					prev.next = current.next;
				}
				System.out.println("data " + data + " remove from index  " + index);
				return;
			}
			prev=current;
			current=current.next;
		}
	}

	public boolean search(int data) {
		int index = data % 16; // 1. calculate bucket index for the data

		HashNode temp = hs[index]; // 2. declare temp variable for index

		while (temp != null) { // 3. traverse linkedlist
			if (temp.data == data) { // 4.check given data is equal to linkedlist data
				System.out.println("data " + data + " found at index  " + index);
				return true;
			}
			temp = temp.next; // 5. move to next node

		}
		System.out.println("data " + data + " not found in hashtable");
		return false; // 6.return false if data is not found
	}

	// 1. create new hashnode object with data which is received as input.

	void add(int data) {
		HashNode newnode = new HashNode(data);

		int index = data % 16; // 2.calculate index for data
		if (hs[index] == null) { // 3. if calculate bucket index is null then newnode insert
			hs[index] = newnode;
		} else {
			HashNode temp = hs[index]; // 4.if bucket is not null declare temp variable for traverse

			while (temp.next != null) { // 5. traverse the linked list until end or duplicate element found
				if (temp.data == newnode.data) { // 6. check currentnode and newnode data is same
					System.out.println("Duplicate");
					System.out.println("data is already present");
					return; // 7.return if duplicate data is present
				}
				if (temp.next == null) { // 8.if last node is null then break
					break;
				}
				temp = temp.next; // 9. move to next node
			}
			temp.next = newnode; // 10.link newnode to the list

		}
		System.out.println("Bucket data:" + data + "  " + "index:" + index);
	}

	void display() {
		System.out.println("Displaying Elements:");
		for (int i = 0; i < 16; i++) { // 11.iterate the loop
			HashNode bucket = hs[i]; // 12.get linkedlist current index
			if (bucket == null) { // 13.check bucket is empty
				continue;
				// System.out.print("Index " + i + ": ");
				// printList(bucket);
			} else {
				printList(bucket); // 14.print the linkedlist starting from index
			}

		}
	}

	private void printList(HashNode bucket) {
		HashNode traveler = bucket; // 15.starting from the begining of linkedlist at given bucket
									// 16.create traveler variable for list to print list node

		while (traveler != null) { // 17.check each node in given linkedlist
			// printList(traveler.next);
			System.out.println(traveler.data); // 18.print data of node
			traveler = traveler.next; // 19.move to next node
		}

		/*
		 * if (traveler.next != null) { System.out.println(traveler.data); } else {
		 * printList(traveler.next); System.out.println(traveler.data); }
		 */
	}

}
