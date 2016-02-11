public class Product {

	private int type;
	private int weigh;

	public Product (int type, int weigh) {
		this.type = type;
		this.weigh = weigh;
	}

	public int getType() {
		return type;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

}
