/**
 * 
 */
package Customers;
import ShoppingCarts.*;
import Store.*;
/**
 * @author TamerHN
 *
 */
public class Customer {
	String name;
	ShoppingCart shoppingCart;
	Store store;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Store getStore() {
		return store;
	}
	public void setStore(Store store) {
		this.store = store;
	}
}
