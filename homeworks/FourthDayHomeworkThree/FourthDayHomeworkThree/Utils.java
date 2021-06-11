package FourthDayHomeworkThree;
import Entities.Customer;
import Interfaces.VerificationService;



public class Utils {
	public static boolean runVerifications(VerificationService[] verificationServices, Customer customer){
		for (VerificationService verificationService : verificationServices) {
			if(verificationService.checkIfRealPerson(customer) == true) {
				return true;
			}
			
		}
		return false;
		
	}	
}

