package Managers;

import Entities.Customer;
import Interfaces.CustomerService;
import Interfaces.VerificationService;
import FourthDayHomeworkThree.Utils;


public class CustomerManager implements CustomerService {
	
	private VerificationService[] verificationServices;
	
	public CustomerManager(VerificationService[] verificationServices) {
		this.verificationServices = verificationServices;
	}
	

	@Override
	public void add(Customer customer) {
		if(Utils.runVerifications(verificationServices, customer) == true) {
			System.out.println(customer.getFirstName() + " " + "Added");
		}
		else {
			
		}
	
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + "Deleted");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + "Updated");
		
	}
	
}
