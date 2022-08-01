import java.util.Scanner;  
public class Method  
{  
	public static void main (String args[])  
	{  
	Scanner s=new Scanner(System.in);  
	System.out.print("Enter the number to check: ");  
	int num=s.nextInt();  
	findEvenOdd(num);  
	}  
	public static void findEvenOdd(int num)  
	{  
	if(num%2==0)   
	System.out.println(num+" The entered number is even");   
	else   
	System.out.println(num+" The entered number is odd");  
	}  
}  
	