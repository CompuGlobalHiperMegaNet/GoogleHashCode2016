public class Location {

	private int x;
	private int y;

	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX (){
		return this.x;
	}

	public int getY (){
		return this.y;
	}

	public boolean equals(Location loc2){
		return (this.x == loc2.getX() && this.y == loc2.getY());
	}
}
