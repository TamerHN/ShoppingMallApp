/**
 * 
 */
package Commands;

import java.util.*;

import Store.*;
import Mall.*;

/**
 * @author TamerHN
 *
 */
public class StoreAdd implements ICommand {

	Mall mall;
	public StoreAdd(Mall m)
	{
		this.mall = m;
	}
	/* (non-Javadoc)
	 * @see Commands.ICommand#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		StoreFactory storefactory;
		Store store;
		
		System.out.println("Where to add the store?");
		System.out.println("BookStore | ShoeStore | GameStore");
		Scanner input = new Scanner(System.in);
		String fact=input.next();
		storefactory = StoreFactory.getStoreFactory(fact);
		System.out.print("Ok, now please enter some info about the store\nName: ");
		String name = input.next();
		System.out.print("\nID: ");
		int id = input.nextInt();
		System.out.println("\n please enter the type of store: \n(0) concrete Store? \n(1) super Store?");
		int type= input.nextInt();
		if (type == 0)
			store = storefactory.getStore("concretestore");
		else 
			store = storefactory.getStore("grandstore");
		store.setName(name);
		store.setId(id);
		System.out.println("Where to add you new Store?\n(0) to the Mall.\n(1) to a grandstore.");
		int gsORmall =input.nextInt();
		if(gsORmall == 0)
			this.mall.addStore(store);
		else 
		{
			System.out.println("Please enter the ID of the GrandStore you want to add this store to: ");
			id= input.nextInt();
			Enumeration<Store> stores = this.mall.stores();
			while(stores.hasMoreElements())
			{
				Store st=  stores.nextElement();
				if(st instanceof GrandStore && st.getId() == id)
					st.addSubStore(store);
			}

		}
		
	}

}
