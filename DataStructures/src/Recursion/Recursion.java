package Recursion;

public class Recursion {

	void print(int n) {    //create method
		if (n > 5) {         
//			System.out.println(5);
			return;
		}
		System.out.println(n);
		print(n + 1);

	}
	public static void main(String[] args) {
		Recursion recursion = new Recursion();    //class cha object bnvla
	recursion.print(1);                           //object ne punha tich method call keli
	}
}