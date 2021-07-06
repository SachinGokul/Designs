package SwagDemo.ReadData;

import java.io.FileInputStream;

public class DataRead {

	public static void main(String[] args) {
		try {
			ReadDataProvider read = new ReadDataProvider();
			String[][] data = read.getTableArray( "Login");
			System.out.println(data);

		} catch (Exception e) {
			
			System.out.println("File not found Exception");
			e.printStackTrace();
			
		}
	}
}
