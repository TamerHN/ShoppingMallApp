/**
 * 
 */
package Items;

import java.util.Enumeration;

/**
 * @author TamerHN
 *
 */
public abstract class Iitem {
	String name;
	int id,storeId, price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void addItem ( Iitem item){};
	public void removeItem ( Iitem item){};
	public Enumeration<Iitem> items(){return null;}

}
