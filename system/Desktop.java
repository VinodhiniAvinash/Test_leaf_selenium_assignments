package org.system;

public class Desktop extends Computer{		//"extends" will link computer class with Desktop class
	
	public static void desktopSize() {
		
		System.out.println("Computer size is 11 inch");
	}
	
	public static void main(String[] args) {
		
		// create object and call the methods
		Desktop system = new Desktop();
		system.computerModel();		//Inherited from computer class
		system.desktopSize();
	}

}
