
/*
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class Euler4
{

	public static void main(String[] args)
	{
		int largest=0; // will hold the value found to be the largest possible palindrone
		
		
		// find a product of 2 numbers
		for (int i=999; i>=100; i--)
		{
			for( int j=999; j>=100; j--)
			{
				if ( isPalindrone(i*j)) // find out if these 2 values produce a palindrone
				{
					// if so, save the product of the 2 values
					System.out.println(i + "*" + j +" =" + i*j);
					
					if(i*j>largest)
						largest=i*j;
					
				} // ends if
	
			} // ends j loop
		
			
		} // ends i loop
		
		// print results
		 System.out.println("Largest Palindrone Found= "+ largest);
		
		
		
	} // ends main
	
	public static boolean isPalindrone(int n) 
	{
		// Method is responsible for determining if a number n is a palindrone
		
		Integer number=new Integer(n); // force n into a Integer
		String value= new String(number.toString()); // force number into a String
		
		int valueLength = value.length();
		
		for(int i=0; i<valueLength; i++)
		{
			int x=value.charAt(i);
			int y=value.charAt(valueLength-i-1);
			if(x==y)
			{
				// do nothing, let the system keep checking
				
			}
			else
			{
				
				return false;
			}
		}
	
		System.out.println("True Palindrone" + n);
		return true;
	}
}

