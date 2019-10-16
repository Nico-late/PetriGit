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
	 * 
	 * @param Weight corresponds to the amount of tokens that will be moved after firing
	 * @param Place corresponds to the Place linked to the arc
	 * @param Transition corresponds to the Transition linked to the arc
	 * @param Type provides information about the type of arc
	 */
	public Arc(int Weight, Place Place, Transition Transition, int Type) {
		if (((Type!=-1) && (Type!=1)) || (weight<0)) {
			throw new IllegalArgumentException("Input Data are wrong");
		}
		else {
		weight = Weight;
		place = Place;
		transition = Transition;
		type = Type;
		}
	}
	
	public Arc(Place Place, Transition Transition, int Type) {
		if (((Type!=0) && (Type!=2))) {
			throw new IllegalArgumentException("Input Data are wrong");
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
	
}
