package Bank;

public class AxisBank extends BankInfo{
	public static void deposit() {
		System.out.println("Override -----> My Axis bank deposit account");
	}
	
	public static void main(String args[]) {
		
		//create object to call deposit() in BankInfo class
		
		BankInfo acc = new BankInfo();
		acc.deposit();
		
		//create object to call methods in BankInfo & AxisBank class
		AxisBank account = new AxisBank();
		
		account.saving();
		account.fixed();
		
		//deposit is overriden
		account.deposit();
		
	}

}
