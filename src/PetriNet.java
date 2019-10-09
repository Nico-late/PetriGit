import java.util.ArrayList;

public class PetriNet {
	
	private ArrayList<Place> placeList;
	private ArrayList<Transition> transitionList;

	public PetriNet() {
		placeList = new ArrayList<Place>();
		transitionList = new ArrayList<Transition>();
	}
	
	public PetriNet(ArrayList<Place> places, ArrayList<Transition> transitions) {
		placeList = places;
		transitionList = transitions;
	}
	
	public void addPlace(Place place) {
			placeList.add(place);
	}
	
	public void addTransition(Transition transition) {
		transitionList.add(transition);
	}
	
	public void delPlace(Place place) {
		if (placeList.contains(place)) {
		placeList.remove(place);
		}
	}
	
	public void delTransition(Transition transition) {
		if (transitionList.contains(transition)) {
		transitionList.remove(transition);
		}
	}
	
	public void addArc(Arc arc) {
		arc.getPlace().addArc(arc);
		arc.getTransition().addArc(arc);

	}
}
