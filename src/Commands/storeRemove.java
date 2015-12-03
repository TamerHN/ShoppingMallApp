/**
 * 
 */
package Commands;
import java.util.Enumeration;
import java.util.Scanner;

import Mall.*;
import Store.GrandStore;
import Store.Store;

/**
 * @author TamerHN
 *
 */
public class storeRemove implements ICommand {

	GrandStore gs;
	public storeRemove(GrandStore m )
	{
		this.gs = m;
	}
	/* (non-Javadoc)
	 * @see Commands.ICommand#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the id of the store\nID:");
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		Enumeration<Store> stores = this.gs.subStores();
		while(stores.hasMoreElements())
		{
			Store st = stores.nextElement();
			if(st.getId() == id)
				gs.removeSubStore(st);
		}

	}

}
