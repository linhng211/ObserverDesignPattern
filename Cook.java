import java.util.ArrayList;
/**
 * 
 * @author Linh Nguyen
 * This is the "Cook" class which is the object to observe 
 */
public class Cook implements Subject {
	
	private String name = "";
	private ArrayList<Observer> observers;
	/**
	 * This class assign user's input to the name and make the "observers" ArrayList
	 * @param name
	 */
	public Cook(String name) {
		
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	/**
	 * This is the "registerObserver" method which add the observer to follow the Cook
	 */
	public void registerObserver(Observer observer) {
		
		observers.add(observer);
	}
	/**
	 *  This is the "removeObserver" method which remove the observer who does not want to follow the Cook anymore
	 */
	public void removeObserver(Observer observer) {
		
		observers.remove(observer);
	}
	/**
	 * This is the "notifyObservers" which notify the observers the information 
	 */
	public void notifyObservers(String location, String description) {
		
		for(Observer observer : observers) {
			
			observer.update(location,description);
		}
	}
	/**
	 * This is "enterSighting" called every time the cook is seen
	 * @param location
	 * @param description
	 */
	public void enterSighting(String location,String description) {
		
		Sighting input = new Sighting(location, description);
		notifyObservers(location,description);
	}
	/**
	 * This is "getName" which return the name of the cook 
	 * @return
	 */
	public String getName() {
		
		return this.name;
	}
	
}
