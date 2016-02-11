public class Drone {

    public boolean turn_used;
	
    private int payload;
    private int max_payload;
	
    private int actual_turn;
    private Location current_location;

    private Order task;

    private Location near_warehouse;

    private Location deliver_point;

    public Drone (int max_payload, Location current_location, Location near_warehouse){
	this.max_payload = max_payload;
	this.current_location = current_location;
	this.near_warehouse = near_warehouse;
    }
	
    public void load (Order task){
	if (!isOnWareHouse())
	    goToNearWareHouse();
	//TODO
    }
    
    private boolean isOnWareHouse(){
	return (current_location.equals(near_warehouse));
    }
    
    private void goToNearWareHouse (){
	//TODO
    }
}
