package Interfaces;

import Entities.Customer;

public abstract interface VerificationService {

	public abstract boolean checkIfRealPerson(Customer customer);
	
}
