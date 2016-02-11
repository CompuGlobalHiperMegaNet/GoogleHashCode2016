public class Order {

	private Product [] product_list;
	private Location destination;

	public Order (int [] product_list){
		this.product_list = product_list;
	}

	public Product [] getProductList (){
		return product_list;
	}

	public Location getDestination(){
		return destination;
	}
}
