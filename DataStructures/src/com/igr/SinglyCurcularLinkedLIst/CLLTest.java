package com.igr.SinglyCurcularLinkedLIst;

public class CLLTest {
	public static void main(String[] args) {
		CurcularLList cll= new CurcularLList();
		
		
		cll.insertAtLast(25);
		cll.show();
		cll.insertAtLast(72);
		cll.show();
		cll.insertAtLast(85);
		cll.show();
		cll.insertAtLast(75);
		cll.show();
		cll.insertAtFirst(12);
		cll.show();
		//cll.insertAtMiddle(17);
		//cll.show();
		//cll.insertAtGivenLoc(68);
		//cll.show();
		//cll.deleteAtLast();
		//cll.show();
		//cll.deleteAtFirst();
		//cll.show();
		//cll.deleteAtMiddle();
		//cll.show();
		cll.Reverse();
		cll.show();
		
	}

}
