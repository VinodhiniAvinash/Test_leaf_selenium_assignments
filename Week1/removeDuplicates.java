package Week1.Day2;

public class removeDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		
		int count = 0;
		
		String[] split = text.split(" ");
		
		for(int i=0;i<=split.length-1;i++) {
			
			for(int j=i+1;j<=split.length-1;j++){
				
				if(split[i].equals(split[j]) )
				{
					count++;
					split[j]=" ";
					//System.out.print(count);
				}
				}
			
				if(count>0 || split[i]!=" ") {
					
					System.out.print(" "+split[i]);
				}
		}
	}
}
