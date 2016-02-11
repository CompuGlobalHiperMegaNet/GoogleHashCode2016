import java.io.*;

public class GH2016 {

	private int rows;
	private int columns;
	private int drones;
	private int turns;
	private int max_payload;
	private int products[];
	private int products_weigth[];
	private Warehouse warehouse[];
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
			sCurrentLine = reader.readLine();
			splitter = new String [sCurrentLine.split(" ").length];
			splitter = sCurrentLine.split(" ");
			for(int i = 0;i<splitter.length;i++){
				this.products[i] = Integer.parseInt(splitter[i]);
			}
			sCurrentLine = reader.readLine();
			num = Integer.parseInt(sCurrentLine);
			this.warehouse = new Warehouse[num];
			for(int i = 0;i<this.warehouse.length;i++){
				sCurrentLine = reader.readLine();
				splitter = new String [sCurrentLine.split(" ").length];
				splitter = sCurrentLine.split(" ");
				this.warehouse[i].setLocation(Integer.parseInt(splitter[0]), Integer.parseInt(splitter[1]));
				sCurrentLine = reader.readLine();
				splitter = new String [sCurrentLine.split(" ").length];
				splitter = sCurrentLine.split(" ");
				//Almacenado de objetos

			}
			sCurrentLine = reader.readLine();
			num = Integer.parseInt(sCurrentLine);
			this.orders = new int[num];
			for(int i = 0;i<this.orders.length;i++){
				sCurrentLine = reader.readLine();
				splitter = new String [sCurrentLine.split(" ").length];
				splitter = sCurrentLine.split(" ");
				//Destino del envio
				sCurrentLine = reader.readLine();
				num = Integer.parseInt(sCurrentLine);
				//Crear array de items contenidos en el envio
				//Bucle para meter cositas ricas con sus lecturas y tal

			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
