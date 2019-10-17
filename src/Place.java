import java.util.ArrayList;

/**
 * Class that defines the places
 * @author SCHOLTEN_SCHWEITZER_ROULLIER
 *
 */
public class Place {
	
	private int token;
	private ArrayList<Arc> arcsInput;
	private ArrayList<Arc> arcsOutput;

	
	public Place(int token) {
		this.token = token;
		arcsInput = new ArrayList<Arc>(); 
		arcsOutput = new ArrayList<Arc>();
	}
	/**
	 * Add the number of token to the place.
	 * @param number
	 */
	public void addToken(int number) {
		this.token += number;
	}
	
	public int getToken() {
		return this.token;
	}
	/**
	 * Delete the number of token to the place.
	 * @param number
	 * @throws WrongInputException
	 */
	public void delToken(int number) throws WrongInputException {
		if (this.getToken()>=number) {
			this.token -= number;
		}
		else {
			throw new WrongInputException();
		}
	}
	
	/**
	 * Set the number of token of a place.
	 * @param number
	 */
	public void setToken(int number) {
			this.token = number;
	}
	
	/**
	 * Add an Arc linked to to the place. The if condition is here to check the arc's direction in order to add it in the right list.
	 * @param arc
	 */
	
	public void addArc(Arc arc) {
		if (arc.getType()== -1) {
			arcsInput.add(arc);
		}
		else {
			arcsOutput.add(arc);
		}
	}
	
	// Function that deletes all the arcs tied to this place in all the transitions
	public void delArcPLace() {
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
