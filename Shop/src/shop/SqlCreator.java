package shop;

public class SqlCreator extends Database{

	
	
	public String sqlInsertProducts(String name, String description, double price, int quantity, int minQuantity) 
	{
		String sql= "INSERT INTO PRODUCTS (NAME, DESCRIPTION, PRICE, QUANTITY, MIN_QUANTITY)" + 
				"VALUES(" + "'" + name + "'" + "," +
						"'" + description + "'" + "," +
						price + "," +
						quantity + "," +
						minQuantity + ");";
		return sql;
	}
		
	public String sqlSelect(String tableName, String where, String orderBy, String typeOfOrder)
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
	
	public String sqlUpdateProduct(String tableName, String where, String columnName, String value)
	{
		
		String sql= "UPDATE " + tableName + " set " + columnName + " = " + value + " WHERE " + where + ";";
		return sql;
	}
	
	public String sqlDeleteProduct(String tableName, String where) 
	{
		String sql= "DELETE FROM " + tableName + " WHERE " + where + ";";
		return sql;
	}
	
}
