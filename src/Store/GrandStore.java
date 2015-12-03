/**
 * 
 */
package Store;

import java.util.Enumeration;
import java.util.Vector;

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
	
	Enumeration <Store> subStores()
	{
		Enumeration <Store> eSubSt = this.SubStors.elements();
		return eSubSt;
	}
	void removeSubStore(Store st)
	{
		SubStors.remove(st);
	}
	void addSubStore(Store st)
	{
		SubStors.add(st);
	}
}
