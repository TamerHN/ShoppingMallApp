/**
 * 
 */
package Store;

/**
 * @author TamerHN
 *
 */
public class GameStore extends StoreFactory {
	
	// used for singleton - lazy instantiation 
		private static GameStore gameStore;
		public GameStore(){}
		public static GameStore getGameStore()
		{
			if(gameStore == null)
				gameStore = new GameStore();
			return gameStore;
		}
	/* (non-Javadoc)
	 * @see Store.StoreFactory#getStore(java.lang.String)
	 */
	@Override
	public Store getStore(String storeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
