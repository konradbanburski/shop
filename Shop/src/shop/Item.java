package shop;

public class Item {

	private String name;
	private String description;
	private double price;
	private int quantity;
	private int minQuantity;
	
	
	Item(String name, String description, double price, int quantity, int minQuantity) 
	{	
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.minQuantity = minQuantity;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
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
		return name;
	}
	
}
