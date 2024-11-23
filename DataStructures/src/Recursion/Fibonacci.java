package Recursion;

public class Fibonacci 
{	
 static int getFibo(int num)
 {
   if(num <= 1)
       return num;
   int sum = 0;
   int last = 1;
   int lastlast = 0;
   for(int i = 1; i < num; i++)
   {
      sum = lastlast + last;
      lastlast = last;
      last = sum;
   }
   return sum;
 }   
public static void main(String[] args) 
{
 System.out.println("Sum of Fibonacci numbers: " +getFibo(10));
  }
}