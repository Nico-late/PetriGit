import java.util.ArrayList;

/**
 * Class that defines the PetriNet
 * @author SCHOLTEN_SCHWEITZER_ROULLIER
 *
 */
public class PetriNet implements IPetriNet{
	
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
			place.delArcPLace();
			placeList.remove(place);
		}
	}
	
	public void delTransition(Transition transition) {
		if (transitionList.contains(transition)) {
			transition.delArcTransition();
			transitionList.remove(transition);
		}
	}
	
	public void addArc(Arc arc) {
		arc.getPlace().addArc(arc);
		arc.getTransition().addArc(arc);

	}
	
	public void delArc(Arc arc) {
		if (arc.getType()==-1) {
			arc.getPlace().getArcsInput().remove(arc);
			arc.getTransition().getArcsOutput().remove(arc);
		}
		else {
			arc.getTransition().getArcsInput().remove(arc);
			arc.getPlace().getArcsOutput().remove(arc);
		}
	}
	
	public void fire(Transition transition) throws WrongInputException {
		if (transitionList.contains(transition)) {
			transition.fire();
		}
	}
	
	public void launch() throws WrongInputException {
		ArrayList<Transition> fireableTransition = new ArrayList<Transition>();
		for(int i=0; i<transitionList.size(); i++) {
			if (transitionList.get(i).fireable()) {
				fireableTransition.add(transitionList.get(i));
			}
		}
		while(fireableTransition.size()!=0) {
			int randomNumber = (int) Math.floor(Math.random() * Math.floor(fireableTransition.size()));
			fireableTransition.get(randomNumber).fire();
			fireableTransition.clear();
			
			for(int i=0; i<transitionList.size(); i++) {
				if (transitionList.get(i).fireable()) {
					fireableTransition.add(transitionList.get(i));
				}
			}
		}
		
	}
	
	public void addToken(Place place, int number) {
		if (placeList.contains(place)) {
			place.addToken(number);
		}
	}
	
	public void delToken(Place place, int number) throws WrongInputException {
		if (placeList.contains(place)) {
			place.delToken(number);
		}
	}
	
	public void setToken(Place place, int number) {
		if (placeList.contains(place)) {
			place.setToken(number);
		}
	}
	
	public void setWeight(Arc arc,int weight) throws WrongInputException {
		arc.setWeight(weight);
	}
	
	public void setType(Arc arc, int type) throws WrongInputException {
		if ((type==0) || (type==2)) {
			arc.setType(type);
		}
		else {
			throw new WrongInputException();
		}
	}
	
	public void setType(Arc arc, int type, int weight) throws WrongInputException {
		if ((type==-1) || (type==1)) {
			arc.setType(type, weight);
		}
		else {
			throw new WrongInputException();
		}
	}
}
