package Week1.Day2;

public class palindrome {

	public static void main(String[] args) {
		String input = "madam";
		String revinput="";
		
		for (int i=input.length()-1;i>=0;i--) {
			revinput=revinput + input.charAt(i);
		}
		
		if(revinput.equals(input)) {
			System.out.println(input+" is a palindrome");
		}
		else
			System.out.println((input+" is not a palindrome"));
	}


}
