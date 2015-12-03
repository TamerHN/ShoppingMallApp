/**
 * 
 */
package Store;

import java.util.*;

import Customers.*;
import Items.*;

/**
 * @author TamerHN
 *
 */
public abstract class Store extends Observable implements Cloneable{
	String name;
	int id;
	Vector <Iitem> items = new Vector<Iitem>();
	Vector <Customer> customers = new Vector<Customer>();
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

	public Enumeration <Customer> customers()
	{
		Enumeration <Customer> cust = this.customers.elements();
		return cust;
	}
	public Enumeration <Iitem> items()
	{
		Enumeration <Iitem> it = this.items.elements();
		return it;
	}
	public void addItem(Iitem item)
	{
		this.items.add(item);
		setChanged();
		notifyObservers(item);
	}
	public void enter(Customer c)
	{
		this.customers.add(c);
	}
	public void exit(Customer c)
	{
		this.customers.remove(c);
	}
	
	public void addSubStore(Store subSt){}
	public Enumeration <Store> subStores(){ return null;}
	public void removeSubStore(Store subSt ){}
	

	
}
