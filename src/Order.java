public class Order {

	private Product [] product_list;

	public Order (int [] product_list){
		this.product_list = product_list;
	}

	public Product [] getProductList (){
		return product_list;
	}
}
