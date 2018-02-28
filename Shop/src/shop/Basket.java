package shop;

/**
 * This class is a basket in the store.
 * 
 */
import java.util.ArrayList;

public class Basket {

	private ArrayList<Item> basket = new ArrayList<Item>();
	SqlCreator sqlCreator = new SqlCreator();
	Database db = new Database();
	
	public ArrayList<Item> getBasket() {
		return basket;
	}
	
	public void clearBasket() {
		for(int i = 0; i<basket.size(); i++)
		{
			deleteItemFromBasket(i);
		}
	}
	
	public void addItemToBasket(Item item, int quantity) {
		basket.add(item);		
		int finalQuantity = item.getQuantity() - quantity;
		String sql = sqlCreator.updateProduct("PRODUCTS","NAME = " + "'" +item.getName() + "'" , "QUANTITY", String.valueOf(finalQuantity));
		System.out.println(sql);
		db.update(sql);
		item.setQuantity(quantity);
	}
	
	public void deleteItemFromBasket(int index) {
		int quantityInBasket = basket.get(index).getQuantity();
		System.out.println(quantityInBasket);
		String nameOfItem = basket.get(index).getName();
		System.out.println(nameOfItem);
		String sql = sqlCreator.select("PRODUCTS", "NAME = " + "'" + nameOfItem + "'", null, null);
		int quantityInDB = db.selectOne(sql).getQuantity();
		System.out.println(quantityInDB);
		int finalQuantity = quantityInBasket + quantityInDB;
		System.out.println(finalQuantity);
		sql = sqlCreator.updateProduct("PRODUCTS", "NAME = " + "'" + nameOfItem + "'", "QUANTITY", String.valueOf(finalQuantity));
		db.update(sql);
		basket.remove(index);
	}



}
