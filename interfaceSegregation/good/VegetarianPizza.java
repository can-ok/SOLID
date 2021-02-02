package InterfaceSegregation;

public class VegetarianPizza implements Pizza{

	@Override
	public void addSauce() {
		System.out.println("sos ekle");
		
	}

	@Override
	public void bake() {
		System.out.println("piþir");

		
	}


    public void addMushrooms() {System.out.println("Adding mushrooms");}

}
