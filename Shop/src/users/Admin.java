package users;

import database.Database;
import database.SqlCreator;

/*
 *  
 */
public class Admin {

	SqlCreator sqlCreator = new SqlCreator();
	Database db = new Database();
	
	public void addNewItem(String name, String description, double price, int quantity, int minQuantity, String type)
	{
		String sql = sqlCreator.insertProductQuery(name, description, price, quantity, minQuantity, type);
		db.insert(sql);
	}
	
	public void updateItemName(String name, String newName )
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAME = '" + name + "'", "NAME", newName);
		db.update(sql);
	}
	
	public void updateItemDescription(String name, String newDescription )
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAME = '" + name + "'", "DESCRIPTION", newDescription);
		db.update(sql);
	}

	public void updateItemPrice(String name, double newPrice)
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAME = '" + name + "'", "PRICE", String.valueOf(newPrice));
		db.update(sql);
	}
	
	public void updateItemQuantity(String name, int newQuantity )
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAME = '" + name + "'", "QUANTITY", String.valueOf(newQuantity));
		db.update(sql);
	}
	
	public void updateItemMinQuantity(String name, int newMinQuantity )
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAME = '" + name + "'", "MIN_QUANTITY", String.valueOf(newMinQuantity));
		db.update(sql);
	}
	
	public void updateItemType(String name, String type)
	{
		String sql = sqlCreator.updateQuery("PRODUCTS", "NAM = '" + name + "'", "TYPE", type);
		db.update(sql);
	}
	
	public void deleteItem(String name)
	{
		String sql = sqlCreator.deleteQuery("PRODUCTS", "NAME = '" + name + "'");
		db.delete(sql);
	}
}
