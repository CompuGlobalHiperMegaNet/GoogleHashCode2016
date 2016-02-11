public class Simulation {

	private int max_payload;
	private int rows;
	private int columns;

	private Drone[] drone;
	private Warehouse[] warehouse;
	
	private int turns;

	public Warehouse[] whoHasMyProduct(Order order){

		Warehouse [] near_warehouses = Warehouse [order.getProductList().length];
		Product [] product_list = order.getProductList();
		Warehouse [] = sortByNearWareHouse(order.getDestination());
		for (int i = 0; i < near_warehouses.length; i++){
			for (int j = 0; j < this.warehouse.length; j++){
				if (warehouse[j].hasStock(product_list[i])){
					near_warehouse[j] = warehouse[i];
				}
			}
		}
	}

	public Warehouse[] sortByNearWareHouse(Location destination){
		Warehouse [] sorted = new Warehouse [this.warehouse.length];
		for (int i = 0; i < warehouse.length; i++){
			for (int j = i+1; j < warehouse.length; j++){
			}
		}
		return sorted;
	}

		   
}
