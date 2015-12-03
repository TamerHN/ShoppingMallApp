/**
 * 
 */
package Store;

import java.util.Hashtable;

/**
 * @author TamerHN
 *
 */
public class BookStore extends StoreFactory {

	// used for singleton - lazy instantiation 
		private static Hashtable <String,Store> storesMap = new Hashtable<String,Store>();
		private static BookStore bookStore;
		public BookStore(){}
		public static BookStore getBookStore()
		{
			if(bookStore == null)
				bookStore = new BookStore();
			return bookStore;
		}
	/* (non-Javadoc)
	 * @see Store.StoreFactory#getStore(java.lang.String)
	 */
	@Override
	public Store getStore(String storeType) {
		// TODO Auto-generated method stub
		
		if(storeType.equalsIgnoreCase("concretestore"))
		{
			ConcreteStore cs= (ConcreteStore)storesMap.get("concretestore");
			if(cs == null)
			{
				cs = new ConcreteStore();
				storesMap.put("concretestore", cs);
				return cs;
			}
			return cs.clone();
		}
		else if (storeType.equalsIgnoreCase("grandstore"))
		{
			GrandStore gs= (GrandStore)storesMap.get("grandstore");
			if(gs == null)
			{
				gs = new GrandStore();
				storesMap.put("grandstore", gs);
				return gs;
			}
			return gs.clone();
		}
		else 
			System.out.println("Not Exist!");
		return null;
	}

}
