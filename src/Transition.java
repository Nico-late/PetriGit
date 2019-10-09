import java.util.ArrayList;

public class Transition {
	
	private ArrayList<Arc> arcsEntrants;
	private ArrayList<Arc> arcsSortants;
	
/*	public boolean enable() {
		for(int i=0; i<arcsEntrants.size(); i++) {
			if (i.getWeight()>i.getPlace().getToken()) {
				return false;
			}
		}
		return true;
	}
	
	public void fire() {
		if (this.enable()) {
			for(int i=0; i<arcsEntrants.size(); i++) {
				i.getPLace().delToken(i.getWeight());
			}
			for(int j=0; j<arcsSortants.size(); j++) {
				j.getPLace().addToken(j.getWeight());
			}
		}
		else {
			throw new IllegalArgumentException("This transition can't be fired");
		}
	} */
	
	public void addArc(Arc arc) {
		if (arc.getType()== -1) {
			arcsSortants.add(arc);
		}
		else {
			arcsEntrants.add(arc);
		}
	}
	
	public ArrayList<Arc> getArcsEntrants(){
		return arcsEntrants;
	}
}
