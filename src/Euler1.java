/* Project Euler: Problem 1
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */


public class Euler1
{
	public static void main(String[] args)
	{
		int rangeMin=0; // sets the minimum value of a range (ie 5-25 rangeMin is 5)
		int rangeMax=1000; // sets the maximum value of a range
		int answer=-1; // answer is the output of the program, default is -1 until solved
		int sum=0;
	
		for(int i=rangeMin; i < rangeMax; i++ )
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			
			}
			else;
		}
		answer=sum;
		if (answer>0)
			System.out.println(answer);
	}
	
	
}
