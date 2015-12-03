/**
 * 
 */
package Mall;
import java.util.*;

import Store.*;
import Items.*;
import ShoppingCarts.*;
import Customers.*;

/**
 * @author TamerHN
 *
 */
public class Mall {
	String name;
	Vector<Store> stores = new Vector<Store>();
	Vector<Customer> customers = new Vector<Customer>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void enter (Customer c)
	{
		customers.add(c);
		System.out.println("Customer " +c.getName() + " has entered the MALL!");
	}
	void exit (Customer c)
	{
		customers.remove(c);
		System.out.println("Customer " +c.getName() + " has exited from the MALL!");
	}
	public ShoppingCart getShoppingCart()
	{
		ShoppingCart sc= new ShoppingCart();
		System.out.println("You got an empty shopping cart :)");
		return sc;
	}
	public Enumeration <Customer> customers()
	{
		Enumeration<Customer> cust = this.customers.elements();
		return cust;
	}
	public Enumeration <Store> stores()
	{
		Enumeration<Store> stores = this.stores.elements();
		return stores;
	}
	public void addStore(Store st)
	{
		stores.add(st);
		System.out.println("The Store: "+ st.getName() +" has been added successfully to the MALL "+this.name);
	}
}
