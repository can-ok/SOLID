package openClosed.good;

public class InsuranceCalculator {
		
	public double calculateDiscount(Customer customer,double price) {
		
		if(customer.isLoyalCustomer()) {
			return (price*0.10)-customer.getBonus();
		}
		
		return (price*0.5);
	
	}
}
