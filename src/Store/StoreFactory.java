/**
 * 
 */
package Store;

/**
 * @author TamerHN
 *
 */
public abstract class StoreFactory {
	public static StoreFactory getStoreFactory(String storeFactory)
	{
		StoreFactory fact= null;
		if(storeFactory.equalsIgnoreCase("BookStore"))
			fact =BookStore.getBookStore();
		else if(storeFactory.equalsIgnoreCase("shoestore"))
				fact = ShoeStore.getShoeStore();
		else if(storeFactory.equalsIgnoreCase("gamestore"))
				fact = GameStore.getGameStore();
		else
			System.out.println("There is no store with this name!");
		return fact;
	}
	public abstract Store getStore(String storeType);

}
