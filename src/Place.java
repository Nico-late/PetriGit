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
	
	public void setToken(int number) {
			this.token = number;
	}
	
	public void addArc(Arc arc) {
		if (arc.getType()== -1) {
			arcsInput.add(arc);
		}
		else {
			arcsOutput.add(arc);
		}
	}
	
	// Function that deletes all the arcs tied to this place in all the transitions
	public void delPLace() {
		for(int i=0; i<arcsOutput.size(); i++) {
			arcsOutput.get(i).getTransition().getArcsInput().remove(arcsOutput.get(i));
		}
		for(int j=0; j<arcsInput.size(); j++) {
			arcsInput.get(j).getTransition().getArcsOutput().remove(arcsInput.get(j));
		}
	}
	
	public ArrayList<Arc> getArcsInput(){
		return arcsInput;
	}
	
	public ArrayList<Arc> getArcsOutput(){
		return arcsOutput;
	}
}
