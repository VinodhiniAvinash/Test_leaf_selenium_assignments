package Week1.Day2;

public class reverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
		String rev="";
		
		String[] split = test.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			//System.out.println(split[i]);
			int length = split[i].length();
			if(i%2!=0)
			{
				for(int j=length-1;j>=0;j--)
					rev = rev + split[i].charAt(j);
				}				
			split[i]=rev;
			System.out.print(split[i]);
			rev="";
			
		}
		for(int i=0; i<split.length;i++)
		{
				//System.out.print(split[i]);
		
		}

	}

}
