/**
 * 
 */
package Store;

import java.util.Enumeration;
import java.util.Vector;

import Customers.Customer;

/**
 * @author TamerHN
 *
 */
public class GrandStore extends Store {

	Vector <Store> SubStors = new Vector<Store>();
	public  GrandStore clone()
	{

		GrandStore cs= null;
		try
		{
			cs = (GrandStore) super.clone();
		}
		catch(Exception x)
		{
			System.out.println("ERROR!");
		}
		return cs;
	}
	
	public Enumeration <Store> subStores()
	{
		Enumeration <Store> eSubSt = this.SubStors.elements();
		return eSubSt;
	}
	public void removeSubStore(Store st)
	{
		SubStors.remove(st);
		System.out.println("Substore " + st.getName() + " has been deleted successfully!");
	}
	public void addSubStore(Store st)
	{
		SubStors.add(st);
		System.out.println("Substore " + st.getName() + " has been added successfully!");
	}

}
