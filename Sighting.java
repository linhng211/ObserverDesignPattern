/**
 * 
 * @author Linh Nguyen
 *
 */
public class Sighting {
	
	private String location;
	private String details;
	/**
	 * this method update the locations and details
	 * @param locations
	 * @param details
	 */
	public Sighting(String locations, String details) {
		
		this.location=locations;
		this.details=details;
	}
	/**
	 * This method read the location variable
	 * @return
	 */
	public String getLocation() {
		
		return this.location;
	}
	/**
	 * this method read the detail variable
	 * @return
	 */
	private String getDetails() {
		
		return this.details;
	}
}
