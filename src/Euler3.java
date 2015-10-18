/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Euler3
{
	
	public static void main(String[] args)
	{
		final long factor=600851475143L; // this is the number that we are looking for the largest prime factor of 
		long largest=0;
		long lastPrime=13; // hold the most recent prime number discovered
		
		// produce a value that is a prime number
		// then determine if it is a factor
		
		while(lastPrime <= Math.sqrt(factor))
		{
			if(isFactor(lastPrime,factor) && lastPrime != factor-1)
			{
				largest=lastPrime;
				
			} // ends if
			
			lastPrime=nextPrime(lastPrime, factor);
		} // ends while loop
			
		System.out.println("Largest Prime: " + largest);
	} // end main
	
	// 
	// isFactor()
	// Determines if a input a is a factor of input b
	public static boolean isFactor(long a, long b)
	{
		if(b%a==0)
		{
			return true;
		}
		else
			return false;
		
	} // ends isFactor()
	
	//
	// nextPrime()
	// given an input a, returns the next prime number
	public static long nextPrime(long a, long factor)
	{
		long num=a; // holds a potential prime number
		//int i=2; // keeps track of something
		
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
 } // ends class
