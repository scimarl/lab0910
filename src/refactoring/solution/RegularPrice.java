package refactoring.solution;

public class RegularPrice implements PriceStrategy{

	@Override
	public double getPrice(int daysrented) {
		double price = 0;
		
		if(daysrented <= 5) {
			price = daysrented*2.5;
		}else {
			price = 5*2.5+ (daysrented-5)*0.5;
		}
		
		return price;
	}

}
