package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {
		int firstNum=0, secNum=1, sum=0, n=11;
		System.out.println(firstNum);
		System.out.println(secNum);
		for (int i=2; i<n; i++)
		{
			sum = firstNum + secNum;
			System.out.println(sum);
			firstNum = secNum;
			secNum= sum;
									
		}
		

	}

}
