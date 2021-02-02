package openClosed.good;

import java.util.Random;

public class HealthInsuranceCustomer implements Customer{
	
	private boolean status;
	private int year;
	
	@Override
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
	}

	@Override
	public float getBonus() {
		if(this.year>10 && status==true)
			return new Random().nextInt(20)+1;
		
		return 0;
	}

}
