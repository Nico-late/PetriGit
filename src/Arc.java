
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
	
	public Arc(int Weight, Place Place, Transition Transition, int Type) {
		if (((Type!=-1) && (Type!=0) && (Type!=1) && (Type!=2) ) || (weight<0)) {
			throw new IllegalArgumentException("Input Data are wrong");
		}
		else {
		weight = Weight;
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
