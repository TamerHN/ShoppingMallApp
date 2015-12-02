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
		Store s = new ;
		return s;
	}

}
