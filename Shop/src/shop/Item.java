package shop;

/**
 * 
 * Item class. Contains properties of item.
 *
 */
public class Item {
	
	private String name = "";
	private String description = "";	
	private double price = 0;
	private int quantity = 0;
	private int minQuantity = 0;
	private String type = "other";
	
	public Item()
	{
		
	}
	
	Item(String name, String description, double price, int quantity, int minQuantity, String type) 
	{	
		this.name = name;
		this.description = description;		
		this.price = price;
		this.quantity = quantity;
		this.minQuantity = minQuantity;
		this.type = type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public String getType()
	{
		return type;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public int getMinQuantity()
	{
		return minQuantity;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	public void setMinQuantity(int minQuantity)
	{
		this.minQuantity = minQuantity;
	}
	
	public String toString()
	{
		return name + " " + description + " " + price + " " + quantity + " " + minQuantity + " " + type;
	}
	
}
