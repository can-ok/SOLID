package openClosed.bad;

public class InsuranceCalculator {
	
	public double calculateDiscount(HealthInsuranceCustomer healthInsuranceCustomer,double price) {
			
		if(healthInsuranceCustomer.isLoyalCustomer()) {
			return (price*0.10)-healthInsuranceCustomer.getBonus();
		}
		
		return (price*0.5);
	
	}

	public double calculateDiscount(VehicleInsuranceCustomer vehicleInsuranceCustomer,double price) {
		
		if(vehicleInsuranceCustomer.isLoyalCustomer()) {
			return (price*0.10)-vehicleInsuranceCustomer.getBonus();
		}
		
		return (price*0.5);
	
	}
}
