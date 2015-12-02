/**
 * 
 */
package Store;

import java.util.Observable;

/**
 * @author TamerHN
 *
 */
public abstract class Store extends Observable implements Cloneable{
	String name;
	int id;
	
	public abstract Store clone();
}
