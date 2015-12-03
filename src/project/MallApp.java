package project;
import java.util.Enumeration;

import Store.*;
import Commands.*;
import Items.*;
import Mall.*;

public class MallApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Mall m = new Mall();
		m.setName("LALA");
		ICommand ic = new StoreAdd(m);
		ic.execute();
		ic.execute();
		Enumeration<Store> str = m.stores();
		GrandStore s1 = null ;
		while(str.hasMoreElements())
		{
			Store ss = (Store)str.nextElement();
			if(ss.getId() == 1)
				s1= (GrandStore) ss;
		}
		ICommand ic1 = null;
		if(s1 != null)
		{
			ic1 = new storeRemove(s1);

			ic1.execute();
		}*/
		/*
		
		StoreFactory sf;
		sf = StoreFactory.getStoreFactory("bookstore");
		Store s1 = sf.getStore("concreteStore");
		Store s2 = sf.getStore("concreteStore");
		s1.setName("ABD");
		s2.setName("Mahmood");
		System.out.println("store: "+s1+ " Name: " + s1.getName());
		System.out.println("store: "+s2+ " Name: " + s2.getName());*/
		
		
		
	}

}
