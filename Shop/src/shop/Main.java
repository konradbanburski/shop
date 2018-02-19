package shop;


import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		Database database = new Database();
		SqlCreator sqlCreator = new SqlCreator();
		//String sql = sqlCreator.sqlInsertProducts("Koperek", "nie", -1, -5, 0);
		//database.insert(sql);
		
	
   
		String sql = sqlCreator.sqlDeleteProduct("PRODUCTS", "NAME = 'Marchew' AND ID = 1");
		System.out.println(sql);
		
		database.delete(sql);
		
	      
	     
	}
}
