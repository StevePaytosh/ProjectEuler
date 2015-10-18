
public class Euler6
{

	public static void main(String[] args)
	{
		long sumOfSquares=0; // hold the sum of square calculations
		long squareOfSums=0; // hold the square of sums calculation
		long diff=0; // hold the difference between the sum of squares and the square of sums
		long range=100;
		
		for(int i=1; i<=range; i++) // produce the sum of squares
		{
			sumOfSquares+=(i*i);
		}
		
		squareOfSums= (range*(range+1))/2;
		squareOfSums*=squareOfSums;
		
		diff=squareOfSums-sumOfSquares;
		
		System.out.println("The difference between the sum of square and the square of sums is: " + diff);
		
	} // ends main
	
} // ends class