
public class Students {
	
	public static void getStudentInfo(int id)
	{
		System.out.println("Student id : " + id);
	}
	
	public static void getStudentInfo(int id, String name)
	{
		System.out.println("Student id : " + id);
		System.out.println("Student name : " + name);
	}
	
	public static void getStudentInfo(String email, long phone)
	{
		System.out.println("Student email : " + email);
		System.out.println("Student phone number : " + phone);
	}

	public static void main(String[] args) {
		
		Students student = new Students();
		
		student.getStudentInfo(173);
		student.getStudentInfo(173,"Vino");
		student.getStudentInfo("abc@gmail.com",1989892222);

	}

}
