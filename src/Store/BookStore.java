/**
 * 
 */
package Store;

/**
 * @author TamerHN
 *
 */
public class BookStore extends StoreFactory {

	// used for singleton - lazy instantiation 
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
		System.out.println(storeType +" is created!");
		return null;
	}

}
