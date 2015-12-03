/**
 * 
 */
package Commands;

import java.util.Scanner;

import Items.*;
import Store.*;

/**
 * @author TamerHN
 *
 */
public class ItemAdd implements ICommand {

	Store store;
	public ItemAdd(Store st)
	{
		this.store = st;
	}
	/* (non-Javadoc)
	 * @see Commands.ICommand#execute()
	 */
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.print("please enter:\nName:");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.print("ID:");
		int id = input.nextInt();
		System.out.print("Price:");
		int price = input.nextInt();
		System.out.print("StoreId:");
		int storeID = input.nextInt();
		System.out.println("Is it a (0)Pack or a normal (1)Item?");
		int packOrItem = input.nextInt();
		Iitem item = null;
		if(packOrItem == 0)
			item = new Pack();
		else if(packOrItem == 1)
			item = new Item();
		else 
		{
			System.out.println("Invalid Choice!!!");
			return ;
		}
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setStoreId(storeID);
		this.store.addItem(item);
	}

}
