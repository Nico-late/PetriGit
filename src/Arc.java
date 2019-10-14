
public class Arc {

	private int weight;
	private Place place;
	private Transition transition;
	
	// Type de l'arc
	// -1: arc sortant donc de transition vers place
	// 0: arc zéro (forcément entrant)
	// 1: arc entrant donc de place vers transition
	// 2: arc Empty Edges
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
