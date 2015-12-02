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
	public void addItem ( Iitem item){};
	public void removeItem ( Iitem item){};
	public Enumeration<Iitem> items(){return null;}

}
