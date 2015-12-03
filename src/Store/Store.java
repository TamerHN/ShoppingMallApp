/**
 * 
 */
package Store;

import java.util.*;

/**
 * @author TamerHN
 *
 */
public abstract class Store extends Observable implements Cloneable{
	String name;
	int id;
	Vector <Observer> observers = new Vector<Observer>();
	Vector <Observer> items = new Vector<Observer>();
	Vector <Observer> customers = new Vector<Observer>();
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

	@Override
	public void addObserver(Observer o) 
	{
		observers.add(o);
		System.out.println("A new Observer's been added Successfully to store: "+this.getName());
	}
	

	
}
