/**
 * 
 */
package ShoppingCarts;
import java.util.Enumeration;
import java.util.Vector;

import Items.*;

/**
 * @author TamerHN
 *
 */
public class ShoppingCart {
	Vector <Iitem> Items = new Vector<Iitem> ();
	
	public void addItem ( Iitem item)
	{
		Items.add(item);
	}
	public void removeItem ( Iitem item)
	{
		Items.remove(item);
	}
	public Enumeration<Iitem> items()
	{
		Enumeration<Iitem> items= Items.elements();
		return items;
	}

}
