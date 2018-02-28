package shop;
/*
 *  
 */
public class Admin {

	SqlCreator sqlCreator = new SqlCreator();
	Database db = new Database();
	
	public void addNewItem(String name, String description, double price, int quantity, int minQuantity)
	{
		String sql = sqlCreator.insertProducts(name, description, price, quantity, minQuantity);
		db.insert(sql);
	}
	
	public void updateItemName(String name, String newName )
	{
		String sql = sqlCreator.updateProduct("PRODUCTS", "NAME = '" + name + "'", "NAME", newName);
		db.update(sql);
	}
	
	public void updateItemDescription(String name, String newDescription )
	{
		String sql = sqlCreator.updateProduct("PRODUCTS", "NAME = '" + name + "'", "DESCRIPTION", newDescription);
		db.update(sql);
	}

	public void updateItemPrice(String name, double newPrice)
	{
		String sql = sqlCreator.updateProduct("PRODUCTS", "NAME = '" + name + "'", "PRICE", String.valueOf(newPrice));
		db.update(sql);
	}
	
	public void updateItemQuantity(String name, int newQuantity )
	{
		String sql = sqlCreator.updateProduct("PRODUCTS", "NAME = '" + name + "'", "QUANTITY", String.valueOf(newQuantity));
		db.update(sql);
	}
	
	public void updateItemMinQuantity(String name, int newMinQuantity )
	{
		String sql = sqlCreator.updateProduct("PRODUCTS", "NAME = '" + name + "'", "MIN_QUANTITY", String.valueOf(newMinQuantity));
		db.update(sql);
	}
	
	public void deleteItem(String name)
	{
		String sql = sqlCreator.deleteProduct("PRODUCTS", "NAME = '" + name + "'");
		db.delete(sql);
	}
}
