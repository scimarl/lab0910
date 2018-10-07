package refactoring.solution;

public interface Rental {
	public void add(Rental ri);
	public void remove(Rental ri);
	public Rental getChild(int i);
	public Movie getMovieName();
}
