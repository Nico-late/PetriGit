import java.util.ArrayList;

public class Place {
	
	private int token;
	private ArrayList<Arc> arcsInput;
	private ArrayList<Arc> arcsOutput;

	
	public Place(int Token) {
		token = Token;
		arcsInput = new ArrayList<Arc>(); 
		arcsOutput = new ArrayList<Arc>();
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
			arcsInput.add(arc);
		}
		else {
			arcsOutput.add(arc);
		}
	}

}
