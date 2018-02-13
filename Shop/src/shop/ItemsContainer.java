package shop;

import java.util.ArrayList;

public class ItemsContainer {

	public ArrayList<Item> itemList = new ArrayList<Item>();

	public ItemsContainer()
	{
		// code
	}

	public void addItemToList(String name, String description, double price, int quantity, int minQuantity)
	{
		Item item = new Item(name, description, price, quantity, minQuantity);
		itemList.add(item);
	}

	public void deleteItemFromList(int index)
	{
		itemList.remove(index);
	}
	
	public void setSelectedItemName(int index, String name)
	{
		itemList.get(index).setName(name);
	}
	
	public void setSelectedItemDescription(int index, String description)
	{
		itemList.get(index).setDescription(description);
	}
	
	public void setSelectedItemPrice(int index, double price)
	{
		itemList.get(index).setPrice(price);
	}
	
	public void setSelectedItemQuantity(int index, int quantity)
	{
		itemList.get(index).setQuantity(quantity);
	}
	public void setSelectedItemMinQuantity(int index, int minQuantity)
	{
		itemList.get(index).setMinQuantity(minQuantity);
	}

}
