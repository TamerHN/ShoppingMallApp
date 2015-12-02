/**
 * 
 */
package Store;

import java.util.Hashtable;

/**
 * @author TamerHN
 *
 */
public class ShoeStore extends StoreFactory {
	
	// used for the prototyping 
	private static Hashtable <String,ConcreteStore> storesCashe = new Hashtable <String,Store>();
	private static Hashtable <String,GrandStore> storesCashe = new Hashtable <String,Store>(); // for prototype 
		
	// used for singleton - lazy instantiation
		private static ShoeStore shoeStore;
		public ShoeStore(){}
		public static ShoeStore getShoeStore()
		{
			if(shoeStore == null)
				shoeStore = new ShoeStore();
			return shoeStore;
		}
	/* (non-Javadoc)
	 * @see Store.StoreFactory#getStore(java.lang.String)
	 */
	@Override
	public Store getStore(String storeType) {
		// TODO Auto-generated method stub
		Store store = storesCashe.get(storeType);
		if(store == null)
		{
			
		}
		return store.clone();
	}

}
