
public class Customer {

    private Location loc;
    private Order order;

    public Customer(Location loc, Order order){
	this.loc = loc;
	this.order = order;
    }

    public Location getLocation(){
	return this.loc;
    }

    public Order getOrder(){
	return this.order;
    }

    
    
}
