package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
	
		int n=71,count=0;
		if (n <=1)
			count++;
		for (int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				count++;
		}
			if (count>0)
				System.out.println(n + " is not a prime number");
			else 
				System.out.println( n + " is a prime number");

	}

}
