package database;
/**
 * This class contains methods that create sql queries.
 */
public class SqlCreator{

	public SqlCreator()
	{
		
	}
	
	
	/**
	 * This method create PostgreSQL INSERT query.
	 * @param name 
	 * @param description 
	 * @param price
	 * @param quantity
	 * @param minQuantity
	 * @return Finished PostgreSQL INSERT query in String.
	 */
	public String insertProductQuery(String name, String description, double price, int quantity, int minQuantity) 
	{
		String sql= "INSERT INTO PRODUCTS (NAME, DESCRIPTION, PRICE, QUANTITY, MIN_QUANTITY)" + 
				"VALUES(" + "'" + name + "'" + "," +
						"'" + description + "'" + "," +
						price + "," +
						quantity + "," +
						minQuantity + ");";
		return sql;
	}
	
	/**
	 * This method create PostgreSQL SELECT query.
	 * @param tableName - name of table 
	 * @param where - example: "where column_name = 'value'"
	 * @param orderBy - name of column or name of columns, example "column_name" or "column_name, column_name_2, ... column_name_n) 
	 * @param typeOfOrder - DESC - if u want sort records descending, default or null or others value sort records ascending
	 * @return Finished PostgreSQL SELECT query in String.
	 */
	public String selectQuery(String tableName, String where, String orderBy, String typeOfOrder)
	{
		String sql= "SELECT * FROM " + tableName;
		if(where != null) 
		{
			sql += " WHERE " + where;
		}
		if(orderBy != null)
		{
			sql += "ORDER BY " +orderBy;		
			if(typeOfOrder.equals("DESC"))
			{
				sql += " DESC";
			}					
		}		
		sql += ";";
		return sql;
	}

	/**
	 * This method create PostgreSQL UPDATE query
	 * @param tableName 
	 * @param where - example: "where column_name = 'value'"
	 * @param columnName 
	 * @param value - new value of this columnName
	 * @return Finished PostgreSQL UPDATE query in String.
	 */
	public String updateQuery(String tableName, String where, String columnName, String value)
	{		
		String sql= "UPDATE " + tableName + " set " + columnName + " = " + value + " WHERE " + where + ";";
		return sql;
	}
	
	/**
	 * This method create PostgreeSQL DELETE query
	 * @param tableName
	 * @param where - example: "where column_name = 'value'"
	 * @return Finished PostgreSQL DELETE query in String.
	 */
	public String deleteQuery(String tableName, String where) 
	{
		String sql= "DELETE FROM " + tableName + " WHERE " + where + ";";
		return sql;
	}
	
	
	
	public String insertUserQuery(String userName, String password, String type) 
	{
		String sql= "INSERT INTO USERS (USER_NAME, PASSWORD, TYPE)" + 
				"VALUES(" + "'" + userName + "'" + "," +
						"'" + password + "'" + "," +
						"'" + type + "'" + ");";
		return sql;
	}
	
	
	
}
