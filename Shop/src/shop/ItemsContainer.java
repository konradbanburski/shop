package shop;

import java.util.ArrayList;

public class ItemsContainer extends Database{

	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	public ItemsContainer()
	{
		DbToList(); /napisac selecta
	}

	public void DbToList(String sql) {		
		setArrayList(select(sql));
	}
	
	public ArrayList<Item> getArrayList() {
		return itemList;
	}
	
	public void setArrayList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void clearArrayList() {
		itemList.clear();
	}
	
}
