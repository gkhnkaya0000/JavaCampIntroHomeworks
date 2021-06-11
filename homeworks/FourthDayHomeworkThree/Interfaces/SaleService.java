package Interfaces;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;

public interface SaleService {
	
	void sale(Product product, Customer customer);
	void campaignSale(Product product, Customer customer, Campaign campaign);
}
