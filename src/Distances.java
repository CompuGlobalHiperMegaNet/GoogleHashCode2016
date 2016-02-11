
public class Distances {

    public int euclideanDistance (int r1, int c1, int r2, int c2) {
	double mod1 = Math.pow(Math.abs(r1-r2),2);
	double mod2 = Math.pow(Math.abs(c1-c2),2);
	double res = Math.sqrt(mod1+mod2);
	System.out.println(mod1+ " " +mod2);
	if (((int)res-res) >= 0.5 ) return (int)res+1;
	else return (int)res;
    }

    public static void main (String args[]) {
	int r1 = 3;
	int r2 = 2;
	int c1 = 5;
	int c2 = 2;
	Distances prueba = new Distances();
	System.out.println(prueba.euclideanDistance(r1,c1,r2,c2));
    }
}
	
