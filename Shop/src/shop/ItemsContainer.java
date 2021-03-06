package shop;

/**
 * ItemsConteiners class. This class have ArrayList which contain <code>Items</code>.
 * This is the content of the store 
 */
import java.util.ArrayList;

import database.Database;
import database.SqlCreator;

public class ItemsContainer {

	private ArrayList<Item> itemList = new ArrayList<Item>();
	SqlCreator sqlCreator = new SqlCreator();
	Database db = new Database();
	
	public ItemsContainer()
	{
		DbToList(sqlCreator.selectQuery("PRODUCTS", null, null, null)); 
	}

	public void DbToList(String sql) {
		itemList.clear();
		setArrayList(db.selectAllProducts(sql));
	}
	
	
	public ArrayList<Item> getArrayList() {
		return itemList;
	}
	
	public Item getItem(int index) {
		return itemList.get(index);
	}
	
	public void setArrayList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void clearArrayList() {
		itemList.clear();
	}
	
	
}
