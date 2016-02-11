public class Warehouse {
	private int id;
	private Location location;
	private Product[] products;

	public Warehouse(int id, Location location, Product[] products){
		this.id = id;
		this.location = location;
		this.products = products;
	}

	public Location getLocation(){
		return this.location;
	}

	public Product[] getProducts(){
		return this.products;
	}
	public int getID(){
		return this.id;
	}
	public void setLocation(int row, int column){
		this.location.setX(row);
		this.location.setY(column);
	}
	public void setProducts(int type, int weigh){
		this.products[type].setWeigh(weigh);
	}
}
