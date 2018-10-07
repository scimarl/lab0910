package refactoring.solution;

public class PriceContext {
	private PriceStrategy ps;
	public void setPriceStragety(PriceStrategy ps) {
		this.ps = ps;
	}
	public void getPrice(int daysrented) {
		
		System.out.println(ps.getPrice(daysrented));
	}
}
