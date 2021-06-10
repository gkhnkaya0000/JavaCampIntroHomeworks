package homeworks;

public class Main {
	public static void main(String[] args) {
		Student gokhan = new Student();
		gokhan.id = 1;
		gokhan.email = "gokhankaya2800@gmail.com";
		gokhan.firstName = "Gökhan";
		gokhan.lastName = "Kaya";
		gokhan.password = "123456";
		gokhan.learnCourse = "C#";
		gokhan.role = "Student";
		
		Instructor engin = new Instructor();
		engin.id = 2;
		engin.firstName = "Engin";
		engin.lastName = "Demiroð";
		engin.email = "engindemirog@gmail.com";
		engin.password = "789010";
		engin.course = "c#";
		engin.role = "Instructor";
		
		UserManager userManager =new  UserManager();
		userManager.login(gokhan);
	}
}
