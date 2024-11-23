package com.igr.DoublyCurcularLinkedList;

public class DLLTest {
	public static void main(String[] args) {
	DCurcularLList dl=new DCurcularLList();

	dl.insertAtLast(16);
	dl.show();
	dl.insertAtLast(18);
	dl.show();
		dl.insertAtFirst(11);
		dl.show();
		dl.insertAtFirst(10);
		dl.show();
		dl.insertAtMiddle(15);
		dl.show();
		//dl.deleteAtFirst();
		//dl.show();
		//dl.deleteAtLast();
		//dl.show();
		dl.deleteAtMiddle();
		dl.show();
		dl.Reverse();
		dl.show();
	}
	
}