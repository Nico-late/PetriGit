/**
 * Class that defines the arcs
 * @author SCHOLTEN_SCHWEITZER_ROULLIER
 *
 */
public class Arc {

	private int weight;
	private Place place;
	private Transition transition;
	
	// Arc type
	// -1: Outgoing arc, from a transition to a place
	// 0: Zero arc (always outgoing)
	// 1: Incoming arc, from a transition to a place
	// 2: Empty Edges arc
	private int type;
	
	
	/**
	 * This builder stands for arcs excluding empty and zero arcs.
	 * 
	 * @param Weight corresponds to the amount of tokens that will be moved after firing
	 * @param Place corresponds to the Place linked to the arc
	 * @param Transition corresponds to the Transition linked to the arc
	 * @param Type provides information about the type of arc
	 * @throws WrongInputException 
	 */
	public Arc(int Weight, Place Place, Transition Transition, int Type) throws WrongInputException {
		if (((Type!=-1) && (Type!=1)) || (weight<0)) {
			throw new WrongInputException();
		}
		else {
		weight = Weight;
		place = Place;
		transition = Transition;
		type = Type;
		}
	}
	/**
	 * This builder code for empty and zero arcs. The weight is directly equals to 0 in these cases.
	 * 
	 * @param Weight corresponds to the amount of tokens that will be moved after firing
	 * @param Place corresponds to the Place linked to the arc
	 * @param Transition corresponds to the Transition linked to the arc
	 * @param Type provides information about the type of arc
	 * @throws WrongInputException 
	 */
	public Arc(Place Place, Transition Transition, int Type) throws WrongInputException {
		if (((Type!=0) && (Type!=2))) {
			throw new WrongInputException();
		}
		else {
		weight = 0;
		place = Place;
		transition = Transition;
		type = Type;
		}
	}
	
	public Place getPlace() {
		return place;
	}
	
	public Transition getTransition() {
		return transition;
	}
	
	public int getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}

	/**
	 * This function is used to set the weight of an Arc. It raises an error if the arc is a zero or an empty arc because their
	 * weight is set to 0.
	 * 
	 * @param weight
	 * @throws WrongInputException
	 */
	public void setWeight(int weight) throws WrongInputException {
		if ((this.getType()==1) || (this.getType()==-1)) {
			this.weight=weight;
		}
		else {
			throw new WrongInputException();
		}
	}
	/**
	 * 
	 * @param type
	 */
	public void setType(int type) {
		if ((type==0) || (type==2)) {
			this.type=type;
			this.weight=0;
		}
	}
	
	public void setType(int type, int weight) {
		if ((type==-1) || (type==1)) {
			this.type=type;
			this.weight=weight;
		}
	}
}
