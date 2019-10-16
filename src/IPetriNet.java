/**
 * Interface of the PetriNet
 * @author SCHOLTEN_SCHWEITZER_ROULLIER
 *
 */
public interface IPetriNet {

	/**
	 * Adds a place to the PetriNet
	 * @param place
	 */
	void addPlace(Place place);
	
	/**
	 * Deletes a place to the PetriNet
	 * @param place
	 */
	void delPlace(Place place);
	
	/**
	 * Adds a transition to the PetriNet
	 * @param transition
	 */
	void addTransition(Transition transition);
	
	/**
	 * Deletes a transition to the PetriNet
	 * @param transition
	 */
	void delTransition(Transition transition);
	
	/**
	 * Adds a arc to the PetriNet
	 * @param arc
	 */
	void addArc(Arc arc);

	/**
	 * Deletes a arc to the PetriNet
	 * @param place
	 */
	void delArc(Arc arc);

	/**
	 * Fires a transition
	 * @param transition
	 */
	void fire(Transition transition);
	
	/**
	 * Launches the simulation and stops when no transitions can be fired anymore
	 */
	void launch();
	
	/**
	 * Adds a number of tokens to a place
	 * @param place
	 * @param number
	 */
	void addToken(Place place, int number);
	
	/**
	 * Deletes a number of tokens from a place
	 * @param place
	 * @param number
	 */
	void delToken(Place place, int number);
	
	/**
	 * Sets a place to a number of tokens
	 * @param place
	 * @param number
	 */
	void setToken(Place place, int number);
}
