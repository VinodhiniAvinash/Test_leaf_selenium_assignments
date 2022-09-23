
public class Automation extends MultipleLanguage{

	public static void main(String[] args) {
		
		//create object to call objects from interface and abstract class
		Automation Lang = new Automation();
		Lang.python();
		Lang.ruby();
		Lang.Java();
		Lang.Selenium();
	}
	
	//Implemented from Language interface

	public void Java() {
		System.out.println("JAVA");
		
	}
	
	//Implemented from TestTool interface

	public void Selenium() {
		System.out.println("Seleniuim");
		
	}
	
	//Implemented from multiple language abstract class
	@Override
	public void ruby() {
		System.out.println("RUBY");
		
	}

}
