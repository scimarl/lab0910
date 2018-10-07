package refactoring.solution;

import java.util.ArrayList;
import java.util.List;

public class RentalBasket implements Rental{
	
	List<Rental> rentalitems;
	
	public RentalBasket() {
		List<Rental> rentalitems = new ArrayList<Rental>();
	}
	
	
	@Override
	public void add(Rental ri) {
		rentalitems.add(ri);
		
	}

	@Override
	public void remove(Rental ri) {
		rentalitems.remove(ri);
		
	}

	@Override
	public Rental getChild(int i) {
		
		return rentalitems.get(i);
	}

	@Override
	public Movie getMovieName() {
		
		return null;
	}

	/*int getFrequentRenterPoints() {
		
		 return _movie.getFrequentRenterPoints(_daysRented);
	}*/
}
