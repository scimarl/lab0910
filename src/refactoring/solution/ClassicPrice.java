package refactoring.solution;

public class ClassicPrice implements PriceStrategy{

	@Override
	public double getPrice(int daysrented) {
		double price = 0;
		
		if(daysrented <= 3) {
			price = daysrented*3;
		}else {
			price = 3*3+ (daysrented-3)*1;
		}
		
		return price;
	}

}
