package Week1.Day1;

public class Fibonocci {

	public static void main(String[] args) {
		int num1=0,num2=1,sum=0,n=11;
		
		System.out.println("The fibonacci series are");
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=1;i<n;i++) {
			
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
		}
			

	}

}
