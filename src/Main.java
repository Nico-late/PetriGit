public class Main {

	public static void main(String[] args) {
		PetriNet Petri = new PetriNet();
		Place p1 = new Place(7);
		Place p2 = new Place(5);
		Place p3 = new Place(0);
		Transition t1 = new Transition();
		Arc a1 = new Arc(3, p1, t1, 1);
		Arc a2 = new Arc(2, p2, t1, 1);
		Arc a3 = new Arc(5, p3, t1, -1);

		Petri.addPlace(p1);
		Petri.addPlace(p2);
		Petri.addPlace(p3);

		Petri.addTransition(t1);
		Petri.addArc(a1);
		Petri.addArc(a2);
		Petri.addArc(a3);
		Petri.launch();
		
		System.out.println(p1.getToken());
		System.out.println(p2.getToken());
		System.out.println(p3.getToken());
	}

}
