import java.util.ArrayList;
/**
 * 
 * @author Linh Nguyen
 *This is Cartel class represents for the Observer follow the Cook
 */
public class Cartel implements Observer
{
	private Subject cook;
	private ArrayList<Sighting> sighting;
	/**
	 * This method pass the subject cook, add to the observer list and make a ArrayList sighting keep track of the locations,descriptions
	 * @param cook
	 */
	public Cartel(Subject cook ) {
		
		this.cook=cook;
		cook.registerObserver(this);
		sighting= new ArrayList<Sighting>();
	}
	/**
	 * This is "update" method keep track the location and description to the ArrayListand 
	 */
	public void update(String location, String description) {
		
		Sighting input = new Sighting(location,description);
		sighting.add(input);
	}
	/**
	 * This method displays each location followed by the description 
	 * @param  
	 */
	public String getLog() {
		
		 for (int i = 0; i < sighting.size(); i++)
	      {
	         System.out.println(sighting.get(0).toString() + "(" + sighting.get(1).toString() + ")");
	      }
		 return null;
	}
}
