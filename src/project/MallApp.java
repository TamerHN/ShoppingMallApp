package project;
import Store.*;
import Commands.*;
import Mall.*;

public class MallApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Mall m = new Mall();
		m.setName("LALA");
		ICommand ic = new StoreAdd(m);
		ic.execute();*/
		StoreFactory sf;
		sf = StoreFactory.getStoreFactory("bookstore");
		Store s1 = sf.getStore("concreteStore");
		Store s2 = sf.getStore("concreteStore");
		s1.setName("ABD");
		s2.setName("Mahmood");
		System.out.println("store: "+s1+ " Name: " + s1.getName());
		System.out.println("store: "+s2+ " Name: " + s2.getName());
		
	}

}
