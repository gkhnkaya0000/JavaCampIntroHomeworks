package Managers;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Interfaces.SaleService;

public class SaleManager implements SaleService {

	@Override
	public void sale(Product product, Customer customer) {
		System.out.println(product.getProductName() +  " " + "saled to" + " "+ customer.getFirstName());
		
	}

	@Override
	public void campaignSale(Product product, Customer customer, Campaign campaign) {
		double discountPrice = (product.getPrice() - (product.getPrice() * campaign.getDiscount() /100) );
		System.out.println(product.getProductName() + " " + " with a new discount price" + " " + discountPrice + " " + "saled to" + " " + customer.getFirstName());
		
	}

}
