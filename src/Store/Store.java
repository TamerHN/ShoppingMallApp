/**
 * 
 */
package Store;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author TamerHN
 *
 */
public abstract class Store extends Observable implements Cloneable{
	String name;
	int id;
	ArrayList <Observer> observers = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer o) 
	{
		observers.add(o);
		System.out.println("A new Observer's been added Successfully");
	}

	public abstract Store clone();
}
