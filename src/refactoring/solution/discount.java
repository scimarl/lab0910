package refactoring.solution;

public class discount implements Charge_Discount{

	@Override
	public double setPrice(double Price) {
		
		return Price*0.75;
	}

}
