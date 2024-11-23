package Recursion;


	public class RecursionString {

		public static void main(String[] args) {
	       String str = "abc"
	       		+ "";
	       printSubSequences(str," ");
		}
	    
		static void printSubSequences(String str,String current) {		
			
			if(str.isEmpty())
			{
				System.out.println(current);
				return;
			}
			printSubSequences(str.substring(1),current);
			printSubSequences(str.substring(1),current + str.charAt(0));
		}
	}

