/**
 * 
 * @author Linh Nguyen
 *This is "Subject" interface which have "registerObserver", "removeObserver" and "notifyObservers" methods
 */
public interface Subject {
	
	public void registerObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public void notifyObservers(String location, String description);
}
