package homeworks;

public class UserManager {
	public void register(User user) {
		System.out.println("Registered" + " "+ user.firstName + " "+ user.lastName + " " + "Add rolled" + " " + user.role);
	}
	
	public void login(User user) {
		System.out.println("Loggin" + " "+ user.firstName + " "+ user.lastName);
	}
}
