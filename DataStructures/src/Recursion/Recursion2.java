package Recursion;

public class Recursion2 {
	static void CountDown(int n) {
		if(n<0) {
			return;
		}else {
			System.out.println(n);
			CountDown(n-1);
			}
	}
	public static void main(String[] args) {
		CountDown(10);
	}

}
