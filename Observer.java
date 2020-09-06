/**
 * 
 * @author Linh Nguyen
 *This is "Observer" interface which have "update" and "getLog" methods
 */
public interface Observer {
	
	public void update(String location, String description);
	
	public String getLog();
}
