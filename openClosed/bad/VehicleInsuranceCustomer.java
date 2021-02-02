package openClosed.bad;

import java.util.Random;

public class VehicleInsuranceCustomer {
		
	private int year;
	
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
		
	}
	
	public float getBonus() {
		if(this.year>20)
			return new Random().nextInt(20)+1;
		
		return 0;
	}
}
