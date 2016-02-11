import java.io.*;

public class GH2016 {

	private int rows;
	private int columns;
	private int drones;
	private int turns;
	private int max_payload;
	private int products[];
	private int products_weigth[];
	private int warehouse[];
	private int warehouse_loc[][];
	private int orders[];

	public GH2016(String path){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String sCurrentLine = reader.readLine();
			String[] splitter = sCurrentLine.split(" ");
			int[] nums = new int[splitter.length];
			for(int i = 0; i<nums.length;i++){
				nums[i] = Integer.parseInt(sCurrentLine);
			}
			this.rows = nums[0];
			this.columns = nums[1];
			this.drones = nums[2];
			this.turns = nums[3];
			this.max_payload = nums[4];
			sCurrentLine = reader.readLine();
			int num = Integer.parseInt(sCurrentLine);
			this.products = new int[num];


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
