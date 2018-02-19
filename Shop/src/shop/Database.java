package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



class Database {
	
	
	
	public void connect() {
		Connection connection = null;
	    try {
	        Class.forName("org.postgresql.Driver");	        
	        connection = DriverManager.getConnection(
	        		"jdbc:postgresql://localhost:5432/products","postgres", "16686816");
	        System.out.println("Conected with database");
	      
	        connection.close();
	    } 
	    catch (ClassNotFoundException e) {	        	    
			e.printStackTrace();
	    }
	    catch (SQLException e ) {
			e.printStackTrace();
	    }
	}
	
	public void creatTable() {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(
		        	"jdbc:postgresql://localhost:5432/products","postgres", "16686816");
			System.out.println("Conected with database");
			statement = connection.createStatement();
			 String sql = "CREATE TABLE ORDERS" +
			            "(ID SERIAL      PRIMARY KEY   NOT NULL," +
			            " USER_NAME  	 TEXT   NOT NULL, " +
			            " ADDRESS	 	 TEXT   NOT NULL, " +
			            " PHONE_NUMBER 	 INT    NOT NULL, " +
			            " PRODUCT_NAME   TEXT   NOT NULL, " +
			            " INCOME         REAL   NOT NULL, " +
			            " QUANTITY       INT    NOT NULL, " +
			            " STATUS			 TEXT   DEFAULT 'PROCESSING', " +
			            " COMMENT		 TEXT, " +
			            " RATING         INT);";
		/*	 
			 W TRAKCIE AKCEPTACJI/PRZETWARZANIA 		PROCESSING
			 WYSYLKA/W DORECZENIU					PENDING					
			 DOSTARCZONA								DELIVERED
		*/	 
			 statement.executeUpdate(sql);
			 System.out.println("Table created.");
	         statement.close();
	         connection.close();
		}
		catch (ClassNotFoundException e) {	        	    
			e.printStackTrace();
		}
		catch (SQLException e ) {
			e.printStackTrace();
		}
		finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        }

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        }
    }
}

    public void insert(String sql) {
    		Connection connection = null;
    		Statement statement = null;
	    try {
	    		Class.forName("org.postgresql.Driver");
	        connection = DriverManager
	        		.getConnection("jdbc:postgresql://localhost:5432/products",
	        		"postgres", "16686816");
	        connection.setAutoCommit(false);
	        System.out.println("Conected with database");
	
	        statement = connection.createStatement();    
	        statement.executeUpdate(sql);
	
	        statement.close();
	        connection.commit();
	        connection.close();
	    } catch (Exception e) {
	    		e.printStackTrace();
	    }
	    System.out.println("Record created");
    }

    public ArrayList<Item> select(String sql) {
    		ArrayList<Item> queryList = new ArrayList<Item>();
	    Connection connection = null;
	    Statement statement = null;
	    try {
	        Class.forName("org.postgresql.Driver");
	        connection = DriverManager
	        		.getConnection("jdbc:postgresql://localhost:5432/products",
	        		"postgres", "16686816");
	        connection.setAutoCommit(false);
	        System.out.println("Conected with database");
	
	        statement = connection.createStatement();
	        ResultSet rs = statement.executeQuery(sql);
	        	        
	        			while (rs.next()) {
	        	            Item item = new Item();
	        	            item.setName(rs.getString("NAME"));
	        	            item.setDescription(rs.getString("DESCRIPTION"));
	        	            item.setPrice(rs.getDouble("price"));
	        	            item.setQuantity(rs.getInt("quantity"));
	        	            item.setMinQuantity(rs.getInt("min_Quantity"));
	        	            queryList.add(item);
	        	        }
	        		        
	        rs.close();
	        statement.close();
	        connection.close();
	        return queryList;
	    }
	    
	     catch ( Exception e ) {
	    		e.printStackTrace();
	    }
	    System.out.println("Select done.");
		return null;
	  
		
		
	 }
    
    /*public int selectChecker(String sql) {
	    	String products = "PRODUCTS";
	    	String users = "USERS";
	    	
	    if(sql.contains(products)) 
	    {
	    		return 0;
	    }
	    if(sql.contains(users)) 
	    {
	    		return 1;
	    }
	    return -1;
    	
    }*/
        
    public void update(String sql) {
    		Connection connection = null;
        Statement statement = null;
        try {
        	  	Class.forName("org.postgresql.Driver");
  	        connection = DriverManager
  	        		.getConnection("jdbc:postgresql://localhost:5432/products",
  	        		"postgres", "16686816");
  	        connection.setAutoCommit(false);
  	        System.out.println("Conected with database");
  	        statement = connection.createStatement();    
	        statement.executeUpdate(sql);   
	        connection.commit();
	        statement.close();
	        connection.close();
	    } catch (Exception e) {
	    		e.printStackTrace();
	    }
	    System.out.println("Record updated.");
    }
    
    public void delete(String sql) {
		Connection connection = null;
    Statement statement = null;
    try {
    	  	Class.forName("org.postgresql.Driver");
	        connection = DriverManager
	        		.getConnection("jdbc:postgresql://localhost:5432/products",
	        		"postgres", "16686816");
	        connection.setAutoCommit(false);
	        System.out.println("Conected with database");
	        statement = connection.createStatement();    
        statement.executeUpdate(sql);   
        connection.commit();
        statement.close();
        connection.close();
    } catch (Exception e) {
    		e.printStackTrace();
    }
    System.out.println("Record deleted.");
}
}





