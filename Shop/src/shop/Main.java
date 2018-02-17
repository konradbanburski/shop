package shop;


import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		Database database = new Database();

		String sql = ("SELECT NAME, PRICE, QUANTITY"
				+ "FROM PRODUCTS;");
	
		ArrayList<Item> queryList = new ArrayList<Item>();
		queryList = database.select(sql);
	 
		for(int i = 0; i<queryList.size(); i++)
		{
			System.out.println(queryList.get(i).toString());
        
        }
	         
	      
	     
	}
}
