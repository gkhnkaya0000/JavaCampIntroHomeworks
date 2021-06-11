package Managers;

import Entities.Customer;
import Interfaces.VerificationService;

public class EdevletVerificationManager implements VerificationService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if( customer.getFirstName()=="Gökhan"&& customer.getLastName()=="Kaya" && 
				customer.getDateOfBirth()== 2004  && customer.getNationalityId()==1234){
			
			System.out.println("kisi bilgileri dogrulandi");
			return true;
		}
		else {
			System.out.println("kisi bilgileri dogrulanamadi");
			return false;
		}
	}

}
