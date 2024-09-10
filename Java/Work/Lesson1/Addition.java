import java.util.Scanner ; 
public class Addition
{ 
	
	public static void main (String[] args)
	{ 
		Scanner input = new Scanner (System.in); 
		int num1, num2, num3, culc; 
		System.out.println ("Enter first number:"); 
		num1 = input.nextInt(); 
		System.out.println ("Enter second number:");
		num2 = input.nextInt(); 
		System.out.println ("Enter third number:"); 
		num3 = input.nextInt(); 
		culc = num1 * num2 + num3; 
		System.out.printf ("sum = %d\n", culc); 
	} 
}	

