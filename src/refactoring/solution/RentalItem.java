package refactoring.solution;

public class RentalItem implements Rental{
	private Movie _movie;
	private int _daysRented;
	public RentalItem(Movie m, int daysrented) {
		this._movie = m;
		this._daysRented = daysrented;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}

	@Override
	public void add(Rental ri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Rental ri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rental getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie getMovieName() {
		
		return _movie;
	}

}
