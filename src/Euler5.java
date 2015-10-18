
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5
{

	public static void main(String[] args)
	{
		int range=20;
		int answer=-1;
		int check=20;
		
		while(answer<0)
		{
			if(divisible(check,range))
			{
				// answer is valid
				System.out.println(check);
				break;
			}
			else
			{
				check++;
			}
		} // ends while loop
	} // ends main
	
	//
	// div()
	// checks if an input a, is valid over range r
	
		public static boolean divisible(int a, int r)
		{
			for(int i=1; i<=r; i++)
			{
				
				if(a%i==0)
				{
					// keep going
				}
				else
				{
					return false;
				}
			} // ends for loop
			
			return true;
			
		} // ends method
}
