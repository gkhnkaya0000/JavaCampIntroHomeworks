package FourthDayHomeworkThree;

import Entities.Campaign;
import Entities.Customer;
import Entities.Product;
import Interfaces.VerificationService;
import Managers.EdevletVerificationManager;
import Managers.ProductManager;
import Managers.SaleManager;
import Managers.CampaignManager;
import Managers.CustomerManager;



public class Main {

	public static void main(String[] args) {
	
		VerificationService[] verificationServices = {new EdevletVerificationManager()};
		CustomerManager customerManager = new CustomerManager(verificationServices);
		Customer gokhan = new Customer(1, "Gökhan", "Kaya", 2004, 1234);
		customerManager.add(gokhan);
		customerManager.delete(gokhan);
		customerManager.update(gokhan);
		
		Product product1 = new Product(1,1000,"Gta5");
		
		 ProductManager productManager  =new  ProductManager();
		 
		 productManager.add(product1);
		 productManager.delete(product1);
		 productManager.update(product1);
		 
		 Campaign campaign  =new Campaign(1,"Big discount",20);
		 CampaignManager campaignManager = new  CampaignManager();
		 campaignManager.add(campaign);
		 campaignManager.delete(campaign);
		 campaignManager.update(campaign);
		 
		 SaleManager saleManager = new SaleManager();
		 saleManager.sale(product1, gokhan);
		 saleManager.campaignSale(product1, gokhan, campaign);
		
	
		

	}

}
