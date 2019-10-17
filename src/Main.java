/**
 * Class main to test the code
 * @author SCHOLTEN_SCHWEITZER_ROULLIER
 *
 */
public class Main {

	public static void main(String[] args) throws WrongInputException {
		PetriNet petri = new PetriNet();
		Place p1 = new Place(7);
		Place p2 = new Place(4);
		Place p3 = new Place(0);
		Place p4 = new Place(0);
		
		Transition t1 = new Transition();
		Transition t2 = new Transition();
		Transition t3 = new Transition();
		
		Arc a1 = new Arc(3, p1, t1, 1);
		Arc a2 = new Arc(2, p2, t1, 1);
		Arc a3 = new Arc(5, p3, t1, -1);
		Arc a4 = new Arc(p2,t2,0);
		Arc a5 = new Arc(1,p2,t2,-1);
		Arc a6 = new Arc(p3,t3,2);
		Arc a7 = new Arc(4,p4,t3,-1);
		
		petri.addPlace(p1);
		petri.addPlace(p2);
		petri.addPlace(p3);
		petri.addPlace(p4);

		petri.addTransition(t1);
		petri.addTransition(t2);
		petri.addTransition(t3);
		petri.addArc(a1);
		petri.addArc(a2);
		petri.addArc(a3);
		petri.addArc(a4);
		petri.addArc(a5);
		petri.addArc(a6);
		petri.addArc(a7);
		petri.setWeight(a1, 7);
		//petri.setType(a1,0);
		petri.launch();
		
		System.out.println(p1.getToken());
		System.out.println(p2.getToken());
		System.out.println(p3.getToken());
		System.out.println(p4.getToken());
	}

}
