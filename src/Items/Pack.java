package Items;

import java.util.Enumeration;
import java.util.Vector;

public class Pack extends Iitem {
	Vector <Iitem> ALitems = new Vector<Iitem>();
	
	public void addItem ( Iitem item)
	{
		ALitems.add(item);
	}
	public void removeItem ( Iitem item)
	{
		ALitems.remove(item);
	}
	public Enumeration<Iitem> items()
	{
		Enumeration<Iitem> items= ALitems.elements();
		return items;
	}
	
}
