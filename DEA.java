import java.util.ArrayList;
/**
 * 
 * @author Linh Nguyen
 * This is DEA class represents for the Observer follow the Cook
 */
public class DEA implements Observer {
	
	private Subject cook;
	private ArrayList<String> locations;
	private String notes;
	/**
	 * This method pass the subject cook, add to the observer list and make a ArrayList String keep track of the locations
	 * @param cook
	 */
	public DEA(Subject cook) {
		
		this.cook = cook;
		cook.registerObserver(this);
		this.locations = new ArrayList<String>();
	}
	/**
	 * This is "update" method add the location to the ArrayListand concatenate the descriptions
	 */
	public void update(String location, String description) {
		
		this.locations.add(location + "\n");	
		notes += description + "\n";
		getLog();
	}
	/**
	 * This method display the locations followed by the notes
	 */
	public String getLog() {
		
		return "Locations: " + "\n" + this.locations + "\n" + "Notes: " + "\n" + this.notes;
	}
}
