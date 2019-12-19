import java.util.*;

class addition
{
	static int add(int a, int b)
	{
		return(a+b);
	}

	static int mul(int a, int b)
	{
		return (a*b);
	}

	public static void main(String args[])
	{
		int a=-20, b=10;
		if(a<0)
		{
			a=a-(2*a);
		}


		if(b<0)
		{
			b=b-(2*b);
		}

		int sum=add(a,b);
		System.out.println("the addition is:- "+sum);


		int mult=mul(10,20);
		System.out.println("MULTPLICATION :- "mult);

		
	}
} 


