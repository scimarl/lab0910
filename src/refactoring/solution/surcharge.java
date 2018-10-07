package refactoring.solution;

public class surcharge implements Charge_Discount{

	@Override
	public double setPrice(double Price) {
		return Price*1.1;
		
	}

}
