/*
 * 			The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

			Find the sum of all the primes below two million.
 */
public class Euler10
{
	public static void main(String[] args)
	{
		long sum=0; // hold the running sum of all the primes found
		long lastPrime=0;
		final int max=2000000; // hold the highest number a prime can be found at
		
		for(int i=0; i<max; i++)
		{
			long add=nextPrime(lastPrime, max);
			
			
			if(add<max && (add!=lastPrime || lastPrime==0 || lastPrime==2) )
			{
				System.out.println("add: " + add);
				sum+=add;
			}
			else if (add==lastPrime)
			{
				// nextPrime has returned a given value and can't find any more
				break;
			}
			
			lastPrime=add;
		} // end for loop
		
		System.out.println("Sum: " + sum);
	}
	
	//
	// nextPrime
	//
	public static long nextPrime(long a, long max)
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
				if(num>=max)
				{
					return a;
				}
				
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
