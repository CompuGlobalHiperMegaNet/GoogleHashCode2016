
public class Distances {

    public int euclideanDistance (Location one, Location two) {
	double mod1 = Math.pow(Math.abs(one.getX()-two.getX()),2);
	double mod2 = Math.pow(Math.abs(one.getY()-two.getY()),2);
	double res = Math.sqrt(mod1+mod2);
	//System.out.println(mod1+ " " +mod2);
	if (((int)res-res) >= 0.5 ) return (int)res+1;
	else return (int)res;
    }

    public static void main (String args[]) {
	Location one = new Location(1,2);
	Location two = new Location(3,4);
	Distances prueba = new Distances();
	System.out.println(prueba.euclideanDistance(one,two));
    }
}	
