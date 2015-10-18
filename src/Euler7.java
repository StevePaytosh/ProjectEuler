/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10,001st prime number?
 */


public class Euler7
{

	public static void main(String[] args)
	{
		int lastPrime=0;
		int answer=0;
		int range=10001;
		
		// create a loop to count prime numbers
		for(int i=1; i<=range; i++)
		{
			lastPrime=(int)nextPrime(lastPrime);
		}
		System.out.println("the " + range +" prime number is: " + lastPrime);
	}// ends main
	
	//
	// nextPrime()
	// given an input a, returns the next prime number
	public static long nextPrime(long a)
	{
		long num=a; // holds a potential prime number
		
		if(a==0)
		{
			return 2;
		}
		else if(a==2)
		{
			return 3;
		}
		else;
		
		while(true)
		{	
			num++; // since the last value of num was either the lastPrime or not a prime, increment
			long root=(long) Math.sqrt(num); // find the square root of num
			//System.out.println("nextPrime triggered with num++ =" + num + "  and root: " + root);
			
			
			for(long i=2; i<=root; i++) // loop runs through all the possibilities of factors of a possible prime
			{
				if(num%i == 0)
				{
					break; // breaks the for loop if i is a factor of num
				}
				else if (i==root)
				{
					System.out.println(num+ " is a prime number");
					return num; // if the for loop makes it to this point, num is prime
				}
				else; // continue loop
				
			} // ends for loop	
			
		} // ends while true
		
	} // ends nextPrime()
}
