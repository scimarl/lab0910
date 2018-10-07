package refactoring.solution;

public class NewReleasePrice implements PriceStrategy {

	@Override
	public double getPrice(int daysrented) {
		double price = 0;
		
		if(daysrented == 1) {
			price = 5;
		}else {
			price = 5+ (daysrented-1)*5;
		}
		
		return price;
	}

	
}
