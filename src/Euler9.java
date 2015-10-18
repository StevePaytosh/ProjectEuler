/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 => 9 + 16 = 25 = 5^2.

So a+b+c=12 and a*b*c= 60

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 */

public class Euler9
{

	public static void main(String[] args)
	{
		int a=0;
		int b=0;
		int c=0;
		final int n=1000; // a+b+c=n, set n and find the other values accordingly
		
		for(int i=0; i<n; i++)
		{
			boolean flag=false;
			
			for(int j=i; j<n; j++)
			{
				a=i;
				b=j;
				c=a*a+b*b;
				c=(int)Math.sqrt(c);
				
				if(c<=0)
					break;
				
				//System.out.println("a: "  + a + " b: " + b+ " c: " + c);
				
				
				
				if( isPythagorean(a,b,c) && isGreater(a,b,c) && (a+b+c==n) )
				{
					flag=true;
					break;
				}
				
			} // ends j loop
			
			if(flag)
			{
				System.out.println("a: "  + a + " b: " + b+ " c: " + c + " sum:" + (a+b+c));
				System.out.println("a*b*c= " + (a*b*c) );
				break;
			}
			
		} // ends i loop
		
		System.out.println("end program");
		
	} // ends main
	
	// 
	// isPythagorean
	//
		public static boolean isPythagorean(int a, int b, int c)
		{
			return(a*a+b*b==c*c);	
		} // ends isPythagorean
		
	//
	// isGreater
	//
		public static boolean isGreater(int a, int b, int c)
		{
			return(b>a && c>b);
		} // ends is greater
}
