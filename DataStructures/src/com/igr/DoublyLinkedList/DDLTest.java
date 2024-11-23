package com.igr.DoublyLinkedList;

public class DDLTest {
	public static void main(String[] args) {
		DoublyLList ddL = new DoublyLList();
		ddL.InsertAtFirst(10);
		ddL.display();
		ddL.InsertAtFirst(15);
		ddL.display();
		ddL.InsertAtFirst(18);
		ddL.display();
		ddL.InsertAtFirst(19);
		ddL.display();
		ddL.InsertAtFirst(15);
		ddL.display();
		ddL.InsertAtFirst(11);
		ddL.display();
		ddL.InsertAtLast(12);
		ddL.display();
//		ddL.InsertAtRandom(16);
//		ddL.display();
		//ddL.DeleteAtBeging(0);
		//ddL.display();
		//ddL.DeletionAtLast(0);
		//ddL.display();
		//ddL.DeletionAtRandom(0);
		//ddL.display();
		//ddL.ElementOfLoc(15);
		//ddL.display();
		ddL.ReverseLL();
		ddL.display();
		//ddL.FindNode();
		//ddL.display();
	}

}
