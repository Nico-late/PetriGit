public class Main {

	public static void main(String[] args) {
		PetriNet Petri = new PetriNet();
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
		
		Petri.addPlace(p1);
		Petri.addPlace(p2);
		Petri.addPlace(p3);
		Petri.addPlace(p4);

		Petri.addTransition(t1);
		Petri.addTransition(t2);
		Petri.addTransition(t3);
		Petri.addArc(a1);
		Petri.addArc(a2);
		Petri.addArc(a3);
		Petri.addArc(a4);
		Petri.addArc(a5);
		Petri.addArc(a6);
		Petri.addArc(a7);
/*		Petri.fire(t1);
		Petri.fire(t1);
		Petri.fire(t2);*/
		Petri.launch();

		
		System.out.println(p1.getToken());
		System.out.println(p2.getToken());
		System.out.println(p3.getToken());
		System.out.println(p4.getToken());
	}

}
