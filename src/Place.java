import java.util.ArrayList;

public class Place {
	
	private int token;
	private ArrayList<Arc> arcsEntrants;
	private ArrayList<Arc> arcsSortants;

	
	public Place(int Token) {
		token = Token;
		arcsEntrants = new ArrayList<Arc>(); 
		arcsSortants = new ArrayList<Arc>();
	}
	
	public void addToken(int number) {
		this.token += number;
	}
	
	public int getToken() {
		return this.token;
	}
	
	public void delToken(int number) {
		if (this.getToken()>=number) {
			this.token -= number;
		}
		else {
			throw new IllegalArgumentException("You can't delete more tokens than you have.");
		}
	}
	
	public void addArc(Arc arc) {
		if (arc.getType()== -1) {
			arcsEntrants.add(arc);
		}
		else {
			arcsSortants.add(arc);
		}
	}

}
