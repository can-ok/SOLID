package openClosed.good;

import java.util.Random;

public class VehicleInsuranceCustomer implements Customer{

	
	private int year;
	
	@Override
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

	@Override
	public float getBonus() {
		if(this.year>20)
			return new Random().nextInt(20)+1;
		
		return 0;
	}

}
