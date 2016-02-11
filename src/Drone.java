public class Drone {

	private int payload;
	private int max_payload;
	
	private int actual_turn;
	private Location current_location;

	private Order task;

	private Location near_warehouse;

	private Location deliver_point;

	public Drone (){}

	
	
	public void load (Order task){
		if (current_location.equals(near_warehouse)){
			//TODO
	}
	
}
