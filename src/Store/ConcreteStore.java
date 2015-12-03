package Store;

public class ConcreteStore extends Store {
	
	public  ConcreteStore clone()
	{

		ConcreteStore cs= null;
		try
		{
			cs = (ConcreteStore) super.clone();
		}
		catch(Exception x)
		{
			System.out.println("ERROR!");
		}
		return cs;
	}

}
