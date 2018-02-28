package shop;


import java.sql.SQLException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws SQLException {
	
		Database db= new Database();
		SqlCreator sqlCreator = new SqlCreator();
		Basket basket = new Basket();
		
		

		
		ArrayList<Item> koszyk = basket.getBasket();
	
		
	
		for(int i = 0; i<koszyk.size(); i++)
		{
			System.out.println(koszyk.get(i));
		}
	 
	
		Item item = new Item("Jabłko", "dupa", 22.2, 80, 2);
		basket.addItemToBasket(item, 10);
		for(int i = 0; i<koszyk.size(); i++)
		{
			System.out.println(koszyk.get(i));
		}
		
		basket.deleteItemFromBasket(0);
		for(int i = 0; i<koszyk.size(); i++)
		{
			System.out.println(koszyk.get(i));
		}
	}
}
