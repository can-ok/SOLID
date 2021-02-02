package openClosed.bad;

import java.util.Random;

public class HealthInsuranceCustomer {

	private int year;
	private boolean status;
	
	public boolean isLoyalCustomer() {
		return new Random().nextBoolean();
		
	}
	
	public float getBonus() {
		if(this.year>10 && status==true)
			return new Random().nextInt(20)+1;
		
		return 0;
	}
	

}
