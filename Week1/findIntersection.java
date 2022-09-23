package Week1.Day2;

public class findIntersection {

	public static void main(String[] args) {
		int[] input1 = {3,2,11,4,6,7};
		int[] input2 = {1,2,8,4,9,7};
		
		System.out.print("The intersection numbers are");
		
		for(int i=0;i<input1.length;i++) {
			for(int j=0;j<input2.length;j++) {
				if(input1[i]==input2[j]) {
					System.out.print(" " +input1[i]);
				}
			}
		}

	}

}
